package com.br.projectSpring.resorces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projectSpring.Services.UsersServices;
import com.br.projectSpring.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResorces {

	@Autowired
	private UsersServices service;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll(){
		List<Users> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public  ResponseEntity<Users> findById(@PathVariable Long id){
		Users Obj = service.findById(id);
		return ResponseEntity.ok().body(Obj);
	}
	
}
