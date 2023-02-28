package com.br.projectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projectSpring.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
