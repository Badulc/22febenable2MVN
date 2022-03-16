package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection  {

	public static final Logger LOGGER = LogManager.getLogger();
	
	private String connectionURL = "jdbc:mysql://localhost:3306/";
	private String username = "root";
	private String password = "root";
	
	
	Connection conn = null;
	public void testconnection() throws SQLException {
		System.out.println("attempting connection");
		try {
		conn = DriverManager.getConnection(connectionURL, username, password);
		System.out.println("connection success!!");
		} catch (SQLException se) {
			LOGGER.error(se.getMessage());
		} finally {
			try {
				if (conn != null) {
					System.out.println("attempting to close connection");
					conn.close();
					System.out.println("connection closed");
				}
			conn.close();
			} catch (SQLException e) {
				LOGGER.error(e.getMessage());
				
			}
		}
		
	}
	
}
