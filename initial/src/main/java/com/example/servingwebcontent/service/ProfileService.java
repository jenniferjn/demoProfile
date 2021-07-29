package com.example.servingwebcontent.service;

import com.example.servingwebcontent.model.Profile;

public interface ProfileService {
	
	public int add(Profile profile);
	
	public Profile get(int id);
	
	public void update(int id, Profile profile);
	
	public void delete(int id);
	
}
