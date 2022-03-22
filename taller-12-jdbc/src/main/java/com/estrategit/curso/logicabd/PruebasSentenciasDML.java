package com.estrategit.curso.logicabd;

import java.sql.Connection;
import java.sql.SQLException;

import com.estrategit.curso.singleton.ConexionBaseDatos;

public class PruebasSentenciasDML {

	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBaseDatos.getConexionSqlServer();
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión");
		}
	}

}
