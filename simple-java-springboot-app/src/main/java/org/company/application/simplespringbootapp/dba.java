package org.company.application.simplespringbootapp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;



public class dba {
	private Connection connect = null;
	private Statement stmt = null;
	
	public String db_lookup ( String str ) {
		// some kind of lookup
		try {
			String squery = "select * from somewhere where something='" + str + "';";
		
			String response = stmt.executeQuery( squery );
		
			return response;
		} catch ( Exception e ) { };
	}
	
	public void init( Connection conn ) {
		connect = conn;
		try {
			stmt = conn.createStatement();
		} catch ( Exception e ) {
			
		}
	}
}

