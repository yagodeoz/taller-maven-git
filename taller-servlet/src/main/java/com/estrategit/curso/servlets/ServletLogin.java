package com.estrategit.curso.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("psNombre");
		
		response.getWriter().println("Hola mundo " + nombre);
		
	}
	
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
	
		String usuario = req.getParameter("usuario");
		String clave = req.getParameter("clave");
		
		if ("ADMIN".equals(usuario)) {
			RequestDispatcher rd = req.getRequestDispatcher("/paginas/privadas/dashboard.jsp");
			req.setAttribute("usuario", usuario);
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("/paginas/publicas/error.jsp");
			rd.forward(req, resp);
		}
		
	}
	

}
