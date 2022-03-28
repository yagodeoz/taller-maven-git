package com.estrategit.curso.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/paginas/privadas/fecha.do")
public class ServletFecha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletFecha() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date fechaActual = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		response.getWriter().println("Fecha sistema: " + formateador.format(fechaActual) );
	}

}
