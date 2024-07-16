package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
		String user="root";
		String pass="1234";
	
		try{
			System.out.println("connecting to database: "+ jdbcUrl);
			Connection mycon =DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connecting Successfully ");
		}catch(Exception exc) {
exc.printStackTrace();
	}

}
}