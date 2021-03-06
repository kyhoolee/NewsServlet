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
 * Servlet implementation class DetailNewsServlet
 */
@WebServlet("/DetailNewsServlet")
public class DetailNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response = ServletUtils.setEncode(response);
		
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		
		if(id == null){
			out.print("");
			return;
		}
		
		InfoRetriever infoRetriever = new InfoRetriever();
		List<Information> infoList;
		

		
		try {
			infoList = infoRetriever.getInformationByID(id);
			
			InfoBuilder builder = new InfoBuilder();
			String result = builder.getJSONInfoList(infoList);
			
			out.print(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
