package com.dibrador.br.courseJPASpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dibrador.br.courseJPASpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}