package com.br.projectSpring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.projectSpring.Repositories.CategoryRepository;
import com.br.projectSpring.Repositories.OrderRepository;
import com.br.projectSpring.Repositories.UsersRepository;
import com.br.projectSpring.entities.Category;
import com.br.projectSpring.entities.Order;
import com.br.projectSpring.entities.Users;
import com.br.projectSpring.entities.enums.OrderStatus;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Users u1 = new Users(null, "kenedy", "kndgfls5@gmail.com", "(62) 99139-6080", "92286529");
		Users u2 = new Users(null, "talita", "talita@gmail.com", "(62) 9258-3948", "92287472");
		Users u3 = new Users(null, "pedro", "pedrosalgadin@gmail.com", "(62) 9258-3948", "92287472");
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		usersRepository.saveAll(Arrays.asList(u1, u2, u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3 ));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
	
}
