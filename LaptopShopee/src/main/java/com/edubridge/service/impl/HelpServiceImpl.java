package com.edubridge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.beans.Help;
import com.edubridge.dao.HelpDao;
import com.edubridge.service.HelpService;
@Service
public class HelpServiceImpl implements HelpService {

	@Autowired
	private HelpDao helpDao;
	
	@Transactional
	public void add(Help help) {
		// TODO Auto-generated method stub
		helpDao.add(help);	
	}

}
