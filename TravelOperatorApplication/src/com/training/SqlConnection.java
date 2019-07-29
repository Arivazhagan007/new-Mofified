package com.training;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SqlConnection {
	
public static Connection getSqlConnection(){
		Connection con =null;
		DataSource data=null;
		try {
			Context initContext=new InitialContext();
			Context envContext=(Context) initContext.lookup("java:/comp/env");
			data=(DataSource) envContext.lookup("jdbc/TravelOperator");
			con=data.getConnection();
			} catch (Exception e) {
			e.printStackTrace();
			}
		return con;
	}
}
