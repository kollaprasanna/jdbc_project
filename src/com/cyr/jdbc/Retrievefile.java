package com.cyr.jdbc;

import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrievefile {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jdbc", "root", "admin");  
			              
			PreparedStatement ps=con.prepareStatement("select * from filetable");  
			ResultSet rs=ps.executeQuery();  
			rs.next();//now on 1st row  
			              
			Clob c=rs.getClob(2);  
			Reader r=c.getCharacterStream();              
			              
			FileWriter fw=new FileWriter("d:\\retrivefile.txt");  
			              
			int i;  
			while((i=r.read())!=-1)  
			fw.write((char)i);  
			              
			fw.close();  
			con.close();  
			              
			System.out.println("success");  
			}catch (Exception e) {e.printStackTrace();  }  
			}  
			
	}


