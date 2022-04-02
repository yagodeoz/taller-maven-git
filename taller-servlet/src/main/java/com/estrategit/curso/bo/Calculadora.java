package com.estrategit.curso.bo;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

@Stateless
@WebService
public class Calculadora {

    public Calculadora() {
    }
    
    public Double sumar (@WebParam(name = "sumando1") Double sumando1, 
    		@WebParam(name = "sumando2") Double sumando2) {
    	return sumando1 + sumando2;
    }

}
