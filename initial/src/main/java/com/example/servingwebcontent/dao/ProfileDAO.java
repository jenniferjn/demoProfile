package com.example.servingwebcontent.dao;

import com.example.servingwebcontent.model.Profile;

public interface ProfileDAO {
	
	public int add(String name, String email, String phone, String dob, String image);
	
	public Profile get(int id);
	
	public void update(int id, String name, String email, String phone, String dob, String image);
	
	public void delete(int id);

}
