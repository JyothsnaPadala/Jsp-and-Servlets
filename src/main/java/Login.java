

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import loginDao.DataBaseOperations;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Boolean isUserValid=false;
		
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		
		
		/*if(name.equals("jyothsna")&& password.equals("prajwala"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username",name);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			HttpSession session = request.getSession();

			session.setAttribute("isUserValid","false");
			response.sendRedirect("Login.jsp");
		}*/
		
		try {
		 isUserValid = DataBaseOperations.validateUser(name, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isUserValid) {
			HttpSession session = request.getSession();
			session.setAttribute("username",name);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			HttpSession session = request.getSession();

			session.setAttribute("isUserValid","false");
			response.sendRedirect("Login.jsp");

			
			
		}
	}

}
