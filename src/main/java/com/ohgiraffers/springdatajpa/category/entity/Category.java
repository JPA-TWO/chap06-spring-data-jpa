package com.ohgiraffers.springdatajpa.category.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// TO DO: set the entity with proper annotations(엔티티 설정에 적합한 어노테이션 설정)

public class Category {

	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private int categoryCode;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private String categoryName;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private Integer refCategoryCode;


	public Category() {}

	public Category(int categoryCode, String categoryName, Integer refCategoryCode) {
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.refCategoryCode = refCategoryCode;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getRefCategoryCode() {
		return refCategoryCode;
	}

	public void setRefCategoryCode(Integer refCategoryCode) {
		this.refCategoryCode = refCategoryCode;
	}

	@Override
	public String toString() {
		return "Category{" +
				"categoryCode=" + categoryCode +
				", categoryName='" + categoryName + '\'' +
				", refCategoryCode=" + refCategoryCode +
				'}';
	}
}
