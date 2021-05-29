package faces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SecretService;

@WebServlet        (name="secret", urlPatterns="/secret")

public class SecretServiceServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final SecretService secretService = new SecretService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> results;
		
		try {
			
			
			
			
			
			
			
			
			
			String secretCode = request.getParameter("secretCode");
			
			String regex = "[0-9]+";
			if(!secretCode.matches(regex)) {
				response.getWriter().print("Bad Input!!");;
				System.out.println("logger: injectable input detected!");
				return;
			}
			
			results = secretService.getSecretFilesUsingSecretCode(secretCode);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			String query = secretService.getQuery();
			if(results.isEmpty()) {
				response.getWriter().print("No Result!!!");
			}
			for(String s : results) {
				response.getWriter().print("Query: " +query+"<br>Response<br>");
				response.getWriter().print(s+"<br><br><br>");
				System.out.println(s);
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
