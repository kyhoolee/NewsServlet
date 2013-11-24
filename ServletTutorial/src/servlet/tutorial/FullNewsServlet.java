package servlet.tutorial;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.Information;
import com.minzbox.base.retriever.InfoRetriever;
import com.minzbox.base.transform.InfoBuilder;

public class FullNewsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		res = ServletUtils.setEncode(res);
		
		PrintWriter out = res.getWriter();

		String startDate = req.getParameter("startDate");
		String endDate = req.getParameter("endDate");
		
		if(startDate == null || endDate == null){
			out.print("[]");
			return;
		}
		
		InfoRetriever infoRetriever = new InfoRetriever();
		List<Information> infoList;
		
//		out.println("<HTML>");
//		out.println("<HEAD></HEAD>");
//		out.println("<BODY>");
		
		try {
			infoList = infoRetriever.getInformationByPubDate(startDate, endDate);
			
			InfoBuilder builder = new InfoBuilder();
			String result = builder.getJSONInfoList(infoList);
			
			out.print(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//out.println("</BODY></HTML>");
		
		
//		out.println("<HTML>");
//		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.println("Hello, " + name);
//		out.println("</BODY></HTML>");
	}

	public String getServletInfo() {
		return "A servlet that knows the name of the person to whom it's"
				+ "saying hello";
	}
}