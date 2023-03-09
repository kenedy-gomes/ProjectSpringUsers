package com.br.projectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.projectSpring.entities.Product;
 

public interface ProductRepository extends JpaRepository<Product, Long>{

 

}
