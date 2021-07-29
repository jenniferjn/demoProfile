package com.example.servingwebcontent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.servingwebcontent.model.Profile;
import com.example.servingwebcontent.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	
	@PostMapping("/profile")
	public String add(@RequestBody Profile profile) {
		int id = service.add(profile);
		String result = "Successfully added profile with id : " + id;
		return result;
	}
	
	@GetMapping("/profile/{id}")
	public Profile get(@PathVariable("id") int id) {
		return service.get(id);
	}
	
	@PutMapping("/profile/{id}")
	public String update(@PathVariable("id") int id, @RequestBody Profile profile) {
		service.update(id, profile);
		String result = "Successfully updated profile with id : " + id;
		return result;
	}
	
	@DeleteMapping("/profile/{id}")
	public String add(@PathVariable("id") int id) {
		service.delete(id);
		String result = "Successfully deleted profile with id : " + id;
		return result;
	}
}
