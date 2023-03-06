package com.br.projectSpring.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.projectSpring.Repositories.CategoryRepository;
import com.br.projectSpring.entities.Category;


	@Service
	public class CategoryServices {

		@Autowired
		private CategoryRepository categoryRepository;
		
		public List<Category> findAll() {
			return categoryRepository.findAll();
		}
		
		public Category findById(Long id){
			Optional<Category> obj = categoryRepository.findById(id);
			return obj.get();
		}
		
	}


