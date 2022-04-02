package com.estrategit.curso.oyentes;

import java.util.Enumeration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerSesion implements HttpSessionListener, HttpSessionAttributeListener {

    public ListenerSesion() {
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("Session creada");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("Sesion destruida");
    }

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("Se está agregando un atributo");
		HttpSession sesion = arg0.getSession();
    	System.out.println("JSESSIONID : " + sesion.getId());
    	Enumeration<String> nombres = sesion.getAttributeNames();
    	while (nombres.hasMoreElements()) {
    		String nombre = nombres.nextElement();
    		System.out.println("Valor: " 
    		+ sesion.getAttribute(nombre) );
    	}
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
