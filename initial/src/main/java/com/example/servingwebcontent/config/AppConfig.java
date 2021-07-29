package com.example.servingwebcontent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.example.servingwebcontent.dao.ProfileDAO;
import com.example.servingwebcontent.dao.ProfileDAOImp;
import com.example.servingwebcontent.service.ProfileService;
import com.example.servingwebcontent.service.ProfileServiceImp;

@Configuration
@ComponentScans(value = {
		@ComponentScan("com.example.servingwebcontent.dao"),
		@ComponentScan("com.example.servingwebcontent.service")
})
public class AppConfig {
	@Bean
	public ProfileService profileService() {
        return new ProfileServiceImp();
    }
	
	@Bean
	public ProfileDAO profileDAO() {
        return new ProfileDAOImp();
    }
}
