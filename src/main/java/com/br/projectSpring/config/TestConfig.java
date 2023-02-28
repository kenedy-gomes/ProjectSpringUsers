package com.br.projectSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;

import com.br.projectSpring.Repositories.UsersRepository;
import com.br.projectSpring.entities.Users;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public void run(String... args) throws Exception {
		Users u1 = new Users(null, "kenedy", "kndgfls5@gmail.com", "(62) 99139-6080", "92286529");
		Users u2 = new Users(null, "talita", "talita@gmail.com", "(62) 9258-3948", "92287472");
		 
		usersRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
