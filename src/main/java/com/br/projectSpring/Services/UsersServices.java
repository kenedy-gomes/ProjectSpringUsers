package com.br.projectSpring.Services;
 
	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.br.projectSpring.Repositories.UsersRepository;
	import com.br.projectSpring.entities.Users;

	@Service
	public class UsersServices {

		@Autowired
		private UsersRepository usersRepository;
		
		public List<Users> findAll() {
			return usersRepository.findAll();
		}
		
		public Users findById(Long id){
			Optional<Users> obj = usersRepository.findById(id);
			return obj.get();
		}
		
	}


