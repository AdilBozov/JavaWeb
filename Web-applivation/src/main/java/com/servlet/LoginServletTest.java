package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServletTest extends HttpServlet{
	
	private UserValidationService service = new UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		//System.out.println(request.getParameter("name"));
		//String name = request.getParameter("name");
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("pass", request.getParameter("pass"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
		//PrintWriter writer = response.getWriter();
		
		//writer.println("<html>");
		//writer.println("<head>");
		//writer.println("<title>Yahoo!!!!!!!!</title>");
		//writer.println("</head>");
		//writer.println("<body>");
		//writer.println("My First Servlet");
		//writer.println("</body>");
		//writer.println("</html>");
		
		//writer.println("Adil Bozov");
		//writer.println("Adil Bozov2");
		//writer.println("Adil Bozov3");
		//writer.println("Adil Bozov4");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		boolean isUserValid = service.isUserValid(name, pass);
		
		if(isUserValid){
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("pass", request.getParameter("pass"));
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else{
			request.setAttribute("error", "Invalis password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}
