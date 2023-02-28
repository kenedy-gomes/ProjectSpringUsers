package com.br.projectSpring.resorces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projectSpring.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResorces {

	@GetMapping
	public ResponseEntity<Users> findAll(){
		
		Users u = new Users(2L, "kenedy", "kndgfls5@gmail.com", "(62) 99139-6080", "92286529");
		return ResponseEntity.ok().body(u);
	}
	
	
}
