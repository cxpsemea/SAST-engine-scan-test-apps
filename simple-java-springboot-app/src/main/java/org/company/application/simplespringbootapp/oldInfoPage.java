package org.company.application.simplespringbootapp;

import org.company.security.obsolete.sanitizers;

public class oldInfoPage {
	// TODO: add more stuff here.
	public static String showInfo( String email ) {

		if ( email == null ) {
			return "No email configured.";
		} else {
			return "Current email is: " + sanitizers.sanitize(email);
		}		
	}
}
