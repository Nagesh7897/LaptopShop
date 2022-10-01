package com.edubridge.service;

import com.edubridge.beans.Signin;

public interface CommandsService {
	
	void signin(Signin signin);
	
	void updatepassword(String pass);

}
