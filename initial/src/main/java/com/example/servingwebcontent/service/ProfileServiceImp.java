package com.example.servingwebcontent.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.servingwebcontent.dao.ProfileDAO;
import com.example.servingwebcontent.model.Profile;

public class ProfileServiceImp implements ProfileService {
	
	@Autowired
	private ProfileDAO dao;

	@Override
	public int add(Profile profile) {
		// TODO Auto-generated method stub
		String name = profile.getName();
		String email = profile.getEmail();
		String phone = profile.getPhone();
		String dob = profile.getDob();
		String image = profile.getImage(); 
		return dao.add(name, email, phone, dob, image);
	}

	@Override
	public Profile get(int id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}

	@Override
	public void update(int id, Profile profile) {
		// TODO Auto-generated method stub
		String name = profile.getName();
		String email = profile.getEmail();
		String phone = profile.getPhone();
		String dob = profile.getDob();
		String image = profile.getImage();
		dao.update(id, name, email, phone, dob, image);
		return;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		return;
	}

}
