package com.br.projectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projectSpring.entities.Order;
 

public interface OrderRepository extends JpaRepository<Order, Long>{

}
