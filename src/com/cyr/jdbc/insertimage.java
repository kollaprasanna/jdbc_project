package com.cyr.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertimage {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/jdbc", "root", "admin");  
			              
			PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
			ps.setString(1,"sonoo");  
			  
			FileInputStream fin=new FileInputStream("d:\\lord baba.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
			}  