package com.estrategit.curso.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public final class ConexionBaseDatos {

	private static Connection conn;
	
	public static Connection getConexionSqlServer()
			throws SQLException{
		System.out.println("Creando la conexión a la base de datos");
		Date fechaInicial = new Date();
		Long tiempoInicial = fechaInicial.getTime();
		if (conn == null || conn.isClosed()) {
			crearConexion();			
		}
		Date fechaFinal = new Date();
		Long tiempoFinal = fechaFinal.getTime();
		System.out.println("Tiempo invertido en conexión"
				+ ", " + (tiempoFinal - tiempoInicial ));
		return conn;
	}

	private static void crearConexion()throws SQLException {
		String urlBasedatos =
				"jdbc:sqlserver://mssql-67876-0.cloudclusters.net:19370;"
				+ "databaseName=test;user=taller;password=7QtVMy!n";
		conn = DriverManager.getConnection(urlBasedatos);
	}
	
	public static void commit() throws SQLException {
		conn.commit();
	}
	
	public static void rollback() throws SQLException {
		conn.rollback();
	}
	
	public void cerrarConexion() throws SQLException {
		conn.close();
	}
	
}
