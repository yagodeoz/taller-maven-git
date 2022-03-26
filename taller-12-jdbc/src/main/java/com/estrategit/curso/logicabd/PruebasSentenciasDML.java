package com.estrategit.curso.logicabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.estrategit.curso.singleton.ConexionBaseDatos;

public class PruebasSentenciasDML {

	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBaseDatos.getConexionSqlServer();
			
			String insert = "INSERT INTO CURSO_JAVA (id, nombre, apellido) "
					+ "VALUES (?, ?, ?)";
			
			PreparedStatement sentencia = conexion.prepareStatement(insert);
			
			sentencia.setString(1, "1000");
			sentencia.setString(2, "Virginia");
			sentencia.setString(3, "Quintero");
			
			int filas = sentencia.executeUpdate();
			System.out.println("Cantidas de filas afectadas " + filas);
			
			ConexionBaseDatos.commit();
			
			ResultSet resultado = conexion.createStatement()
					              .executeQuery("select * from CURSO_JAVA");
			while (resultado.next()) {
				String id = resultado.getString(1);
				String nombre = resultado.getString(2);
				String apellido = resultado.getString(3);
				System.out.println("ID Persona: " + id 
						+ ", nombre: " + nombre + 
						", apellido: " + apellido);
				
			}
			
			
			
			
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión");
		}
	}

}
