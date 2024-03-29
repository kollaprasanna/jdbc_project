package com.cyr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fetchrecords {

	public static void main(String[] args) {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");  
		con.setAutoCommit(false);  
		  
		Statement stmt=con.createStatement();  
		stmt.executeUpdate("insert into user420 values(190,'abhi',40000)");  
		stmt.executeUpdate("insert into user420 values(191,'umesh',50000)");  
		  
		con.commit();  
		con.close();  
		  

	}

}
