package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAll() {
		
		return productRepo.findAll();
	}

	
	public void save(Product p) {
		productRepo.save(p);
		
	}

	public Product findById(Integer id) {
		Optional<Product> p = productRepo.findById(id);
		Product pro = null;
		
		if(p.isPresent())
			pro = p.get();
		
		return pro;
	}

	
	public void deleteById(Integer id) {
		productRepo.deleteById(id);
	}


	
	
}