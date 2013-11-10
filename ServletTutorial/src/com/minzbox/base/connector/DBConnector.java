/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minzbox.base.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author kylee
 */
public final class DBConnector {

	private static DBConnector instance;

	private DBConnector() {

	}

	public static DBConnector getInstance() {
		if (instance == null) {
			instance = new DBConnector();
		}
		return instance;
	}

	public Connection connect(String url, String username, String password)
	    throws SQLException {
		Connection connect = DriverManager.getConnection(url, username, password);
		return connect;
	}

	public Connection minzboxConnect() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/minzbox";
		String username = "root";
		String password = "toor";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connect = DriverManager.getConnection(url, username, password);
		//System.out.println("connect is ok");
		return connect;
	}

}
