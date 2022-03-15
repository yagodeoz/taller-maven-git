package com.curso.estrategit.dispositivos;

public class PruebaControlUniversal {
	
	public static void main(String[] args) {
		
		DispositivoElectronico dispositivo =
				new DispositivoElectronico("TV", "SAMSUNG", "dts");
		
		ControlUniversal control = new ControlUniversal();
		
		control.ejecutarComandoDispositivo(dispositivo, 
				dispositivo.encender);
		
		control.ejecutarComandoDispositivo(dispositivo, 
				dispositivo.apagar);
		
	}

}
