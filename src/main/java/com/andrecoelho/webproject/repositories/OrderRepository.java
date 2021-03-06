package com.andrecoelho.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrecoelho.webproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
