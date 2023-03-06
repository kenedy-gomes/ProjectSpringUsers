package com.br.projectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projectSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
