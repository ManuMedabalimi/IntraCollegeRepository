package com.vits.ica.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vits.ica.utility.DBConnection;


public class LoginDaoImpl implements LoginDao {

	String sql = "select * from tb_login_details where username=? and password=?";
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public boolean loginValidate(String username, String password) {
		boolean status = false;
		try {
			System.out.println("In login Dao impl");

			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return status;
	}	
}
