package grailsgoat

import java.util.Date;

class User {

	String email
	String firstname
	String lastname
	String password
	Date created_at
	Date updated_at
    String verify_token
    String forgot_token

    static constraints = {
    	updated_at nullable: true
        forgot_token nullable: true
        verify_token nullable: true

    	email maxSize: 255

    	firstname maxSize: 255

    	lastname maxSize: 255

    	password maxSize: 36

    	verify_token maxSize: 30
        forgot_token maxSize: 30
    }

    static mapping = {
    	updated_at defaultValue: null
    	created_at defaultValue: new Date()
        forgot_token defaultValue: null
    }
}
