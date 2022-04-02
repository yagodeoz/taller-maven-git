package com.estrategit.curso.oyentes;

import java.util.Enumeration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerSesion implements HttpSessionListener {

    public ListenerSesion() {
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	HttpSession sesion = arg0.getSession();
    	System.out.println("JSESSIONID : " + sesion.getId());
    	Enumeration<String> nombres = sesion.getAttributeNames();
    	while (nombres.hasMoreElements()) {
    		String nombre = nombres.nextElement();
    		System.out.println("Valor: " 
    		+ sesion.getAttribute(nombre) );
    	}
    	System.out.println("Session creada");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("Sesion destruida");
    }
}
