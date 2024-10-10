package com.ohgiraffers.springdatajpa.category.repository;

import java.util.List;

import com.ohgiraffers.springdatajpa.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository <Category, Integer> {
	
	// TO DO: create the query with the proper annotation and commands
	public List<Category> findAllCategory();
	
}
