package com.student.manag;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;
	
	public static Connection createC() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String user="root";
			String password="vissi31";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con= DriverManager.getConnection(url, user, password);
			
			
		}
		catch(Exception e) {
		    e.printStackTrace();	
		}
		
		return con;
	}

}
