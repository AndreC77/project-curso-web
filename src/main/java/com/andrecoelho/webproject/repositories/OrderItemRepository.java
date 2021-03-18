package com.andrecoelho.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrecoelho.webproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
