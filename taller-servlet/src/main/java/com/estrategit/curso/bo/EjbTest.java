package com.estrategit.curso.bo;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbTest
 */
@Stateless
@LocalBean
public class EjbTest {

    public EjbTest() {
    }
    
    public String saludar(String nombre) {
    	return "Hola soy un EJB " + nombre;
    }

}
