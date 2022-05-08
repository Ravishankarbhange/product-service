package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductMaster,String> {

	Optional<ProductMaster> findByProductid(Long productId);
	
}
