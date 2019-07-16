package com.vits.ica.service;

import com.vits.ica.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	LoginDaoImpl loginDao = new LoginDaoImpl();

	@Override
	public boolean loginValidate(String username, String password) throws Exception {
		System.out.println("In login service impl");
		return loginDao.loginValidate(username, password);

	}
}