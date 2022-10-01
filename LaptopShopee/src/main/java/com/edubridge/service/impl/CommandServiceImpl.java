package com.edubridge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.beans.Signin;
import com.edubridge.dao.CommandsDao;
import com.edubridge.service.CommandsService;
@Service
public class CommandServiceImpl implements CommandsService{
	
	@Autowired
	private CommandsDao commandsDao;

	@Transactional
	public void signin(Signin signin) {
		// TODO Auto-generated method stub
		commandsDao.signin(signin);
	}

	@Transactional
	public void updatepassword(String pass) {
		// TODO Auto-generated method stub
		commandsDao.updatepassword(pass);
	}


}
