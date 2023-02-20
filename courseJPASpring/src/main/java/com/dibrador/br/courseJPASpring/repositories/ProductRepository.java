package com.dibrador.br.courseJPASpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dibrador.br.courseJPASpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}