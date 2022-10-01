package com.edubridge.dao;

import com.edubridge.beans.Signin;

public interface CommandsDao {

	void signin(Signin signin);
	void updatepassword(String pass);
}
