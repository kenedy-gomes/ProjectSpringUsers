package com.br.projectSpring.Services;
 
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.projectSpring.Repositories.ProductRepository;
import com.br.projectSpring.entities.Product;


	@Service
	public class ProductServices {

		@Autowired
		private ProductRepository productRepository;
		
		public List<Product> findAll() {
			return productRepository.findAll();
		}
		
		public Product findById(Long id){
			Optional<Product> obj = productRepository.findById(id);
			return obj.get();
		}
		
	}


