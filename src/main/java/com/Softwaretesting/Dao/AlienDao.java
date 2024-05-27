package com.Softwaretesting.Dao;

import com.Softwaretesting.Entity.table;

public interface AlienDao {
	public void saveAlien(table as);
	public table checkLogin(String email, String pwd);

}
