package com.init.apiutn.BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DatosBD {
	
	private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final static String URL = "jdbc:sqlserver://localhost";
	private final static String USER = "pepe";
	private final static String PASS = "";
	
	public DatosBD() {}

	public static String getDRIVER() {
		return DRIVER;
	}
	public static String getURL() {
		return URL;
	}
	public static String getUSER() {
		return USER;
	}
	public static String getPASS() {
		return PASS;
	}


}
