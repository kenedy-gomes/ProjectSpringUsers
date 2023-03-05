package com.br.projectSpring.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.projectSpring.Repositories.OrderRepository;
import com.br.projectSpring.entities.Order;


	@Service
	public class OrderServices {

		@Autowired
		private OrderRepository orderRepository;
		
		public List<Order> findAll() {
			return orderRepository.findAll();
		}
		
		public Order findById(Long id){
			Optional<Order> obj = orderRepository.findById(id);
			return obj.get();
		}
		
	}


