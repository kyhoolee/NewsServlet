package servlet.tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.minzbox.base.entities.Information;
import com.minzbox.base.retriever.InfoRetriever;
import com.minzbox.base.transform.InfoBuilder;

/**
 * Servlet implementation class NewsTitleServlet
 */
@WebServlet("/NewsTitleServlet")
public class NewsTitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsTitleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response = ServletUtils.setEncode(response);
		
		PrintWriter out = response.getWriter();

		String sourceId = request.getParameter("sourceId");
		String start = request.getParameter("startIndex");
		String stop = request.getParameter("stopIndex");
		
		if(start == null || stop == null){
			out.print("[]");
			return;
		}
		
		int startIndex = Integer.parseInt(start);
		int stopIndex = Integer.parseInt(request.getParameter("stopIndex"));
		
		InfoRetriever infoRetriever = new InfoRetriever();
		List<Information> infoList;

		
//		try {
//			infoList = infoRetriever.getInformationByPubDate(startDate, endDate);
//			
//			InfoBuilder builder = new InfoBuilder();
//			String result = builder.getJSONInfoList(infoList);
//			
//			out.print(result);
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
