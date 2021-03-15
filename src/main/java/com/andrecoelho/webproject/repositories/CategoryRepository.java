package com.andrecoelho.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrecoelho.webproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
