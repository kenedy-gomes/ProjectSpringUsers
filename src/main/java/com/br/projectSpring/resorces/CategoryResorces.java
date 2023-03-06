package com.br.projectSpring.resorces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.projectSpring.Services.CategoryServices;
import com.br.projectSpring.entities.Category;

 

@RestController
@RequestMapping(value = "/categories")
public class CategoryResorces {

	@Autowired
	private CategoryServices service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list =  service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public  ResponseEntity<Category> findById(@PathVariable Long id){
		Category Obj = service.findById(id);
		return ResponseEntity.ok().body(Obj);
	}
	
}
