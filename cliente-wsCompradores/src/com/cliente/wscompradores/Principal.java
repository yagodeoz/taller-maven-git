package com.cliente.wscompradores;

import org.tempuri.IWsCompradores;
import org.tempuri.WsCompradores;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando");
		IWsCompradores cliente = new WsCompradores().getWsHttpEndpoint();
		System.out.println("Finalizando");
	}
}
