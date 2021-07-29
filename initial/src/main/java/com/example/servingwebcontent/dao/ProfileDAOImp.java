package com.example.servingwebcontent.dao;

import java.util.Vector;

import com.example.servingwebcontent.model.Profile;

public class ProfileDAOImp implements ProfileDAO {

	private Vector<Profile> profiles = new Vector<Profile>();

	@Override
	public int add(String name, String email, String phone, String dob, String image) {
		// TODO Auto-generated method stub
		profiles.add(new Profile(name, email, phone, dob, image));
		return profiles.size()-1;
	}

	@Override
	public Profile get(int id) {
		// TODO Auto-generated method stub
		return profiles.get(id);
	}

	@Override
	public void update(int id, String name, String email, String phone, String dob, String image) {
		// TODO Auto-generated method stub
		profiles.get(id).setName(name);
		profiles.get(id).setEmail(email);
		profiles.get(id).setPhone(phone);
		profiles.get(id).setDob(dob);
		profiles.get(id).setImage(image);
		return;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		profiles.remove(id);
		return;
	}

}
