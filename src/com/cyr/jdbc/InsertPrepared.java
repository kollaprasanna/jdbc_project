package com.cyr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "admin");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?)");  
			stmt.setInt(1,106);//1 specifies the first parameter in the query  
			stmt.setString(2,"ccc");  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
			}  
	


