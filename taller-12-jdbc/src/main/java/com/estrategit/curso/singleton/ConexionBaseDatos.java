package com.estrategit.curso.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexionBaseDatos {

	private static Connection conn;
	
	public static Connection getConexionSqlServer()
			throws SQLException{
		if (conn == null || conn.isClosed()) {
			System.out.println("Creando la conexión a la base de datos");
			crearConexion();
			System.out.println("Conexión entregada con éxito");
		}
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
