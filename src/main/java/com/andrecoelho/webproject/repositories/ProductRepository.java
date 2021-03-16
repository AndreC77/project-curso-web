package com.andrecoelho.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrecoelho.webproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
