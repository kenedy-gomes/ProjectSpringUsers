package com.br.projectSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projectSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
