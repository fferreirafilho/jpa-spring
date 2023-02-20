package com.dibrador.br.courseJPASpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dibrador.br.courseJPASpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}