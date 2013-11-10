package com.minzbox.base.transform;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.arnx.jsonic.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.minzbox.base.entities.Information;
import com.minzbox.base.retriever.InfoRetriever;

public class InfoBuilder {

	public void encodeJSON() throws IOException {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		StringWriter out = new StringWriter();
		obj.writeJSONString(out);
		String jsonText = out.toString();
		
		//System.out.print(jsonText);
		
		JSONArray array = new JSONArray();
		array.add("1");
		array.add("3");
		array.add("5");
		array.add(obj);
		
		StringWriter aOut = new StringWriter();
		array.writeJSONString(aOut);
		String aText = out.toString();
		
		System.out.println(aText);
	}

	public String transformHTML(String htmlContent) {
		String result = "";
		Document doc = Jsoup.parse(htmlContent);

		Elements paras = doc.select("p"); // a with href
		
		List<Paragraph> paraResults = new ArrayList<Paragraph>();
		
		for (Element para : paras) {

			String paraContent = para.text();
			System.out.println(paraContent);
			
			Paragraph paraObject = new Paragraph();
			paraObject.setContent(paraContent);
			
			Document pDoc = Jsoup.parse(para.toString());
			List<Image> imageList = new ArrayList<Image>();
			
			Elements links = pDoc.select("img");
			for (Element link : links) {
				
				String src = link.attr("src");
				String alt = link.attr("alt");
				System.out.println(alt);
				System.out.println(src);
				
				Image img = new Image(src, alt);
				imageList.add(img);
			}

			System.out.println("----------------------");
			System.out.println(para.toString());
			System.out.println("++++++++++++++++++++++");
			
			paraObject.setImages(imageList);
			
			paraResults.add(paraObject);
		}

		result = JSON.encode(paraResults);
		System.out.println(result);
		
		return result;
	}

	public void runSample() {
		String startDate = "2013-10-01";
		String endDate = "2013-10-30";
		try {
			List<Information> infoList = new InfoRetriever()
					.getInformationByPubDate(startDate, endDate);

			String data = infoList.get(0).getRawContent();

			String result = this.transformHTML(data);

			System.out.println(result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		new InfoBuilder().runSample();
		//new InfoBuilder().encodeJSON();

	}

}
