package org.company.application.simplespringbootapp;

import org.company.security.obsolete.sanitizers;

public class ReportGenerator {
	private dba db = null;
	
	public static String showUserReport( String email ) {
		String response = "The user's data: " + user_lookup( email );
		return response;
	}
	
	public String user_lookup ( String email ) {
		// some kind of lookup
		String c_email = sanitizers.sanitize( email );
		
		String response = db.db_lookup( c_email );
		if ( response == null ) {
			response = "No results for " + email;
		}
		return response;
	}
	
	public void init( dba the_db ) {
		db = the_db;
	}
}
