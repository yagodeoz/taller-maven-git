package com.estrategit.curso.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estrategit.curso.bo.EjbTest;


@WebServlet("/servlet_ejb.do")
public class ServletEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private EjbTest ejbTest;
    
    public ServletEJB() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String saludo = ejbTest.saludar(nombre);
		response.getWriter().println("Saludo desde el ejb " + saludo);
	}

}
