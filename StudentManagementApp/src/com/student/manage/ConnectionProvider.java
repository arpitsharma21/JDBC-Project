package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	//for storing connection a variable is required of connection type and made static as non - static member cannot be used in static func
	static Connection con;
	
	public static Connection createC() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			 String user = "root";
			 String password = "password";
			 String url = "jdbc:mysql://localhost:3306/student_manage";
			 
			 con = DriverManager.getConnection(url,user,password); 
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}
