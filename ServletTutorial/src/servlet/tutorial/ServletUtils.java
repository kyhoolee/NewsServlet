package servlet.tutorial;

import javax.servlet.http.HttpServletResponse;

public class ServletUtils {

	public static HttpServletResponse setEncode(HttpServletResponse response){
		response.setContentType("text/html");
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		return response;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
