package com.estrategit.curso.logicabd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.estrategit.curso.singleton.ConexionBaseDatos;

public class PruebasSentenciasDML {

	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBaseDatos.getConexionSqlServer();
			
			ResultSet resultado = conexion.createStatement()
					              .executeQuery("select * from CURSO_JAVA");
			while (resultado.next()) {
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
				String id = resultado.getString("id");
				
				
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión");
		}
	}

}
