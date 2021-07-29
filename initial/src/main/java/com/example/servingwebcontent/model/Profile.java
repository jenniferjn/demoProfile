package com.example.servingwebcontent.model;

public class Profile {
	
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String image;
	
	public Profile(String name, String email, String phone, String dob, String image) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.image = image;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
