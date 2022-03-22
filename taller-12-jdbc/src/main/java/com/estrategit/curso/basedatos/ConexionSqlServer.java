package com.estrategit.curso.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSqlServer {

	public static void main(String[] args) 
	throws SQLException
	{
		String urlBasedatos =
		"jdbc:sqlserver://mssql-67876-0.cloudclusters.net:19370;"
		+ "databaseName=test;user=taller;password=7QtVMy!n";
		
		Connection con = DriverManager.getConnection(urlBasedatos);
		
		if (con != null)
			System.out.println("Connection exitosa");
		else
			System.out.println("No se pudo conectar");
	}

}
