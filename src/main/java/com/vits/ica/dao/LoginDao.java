package com.vits.ica.dao;

public interface LoginDao {
	
	public boolean loginValidate(String username,String password) throws Exception;

}
