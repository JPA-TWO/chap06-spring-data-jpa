package com.ohgiraffers.springdatajpa.menu.entity;

import jakarta.persistence.*;

// TO DO: set the entity with proper annotations(엔티티 설정에 적합한 어노테이션 설정)

public class Menu {

	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private int menuCode;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private String menuName;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private int menuPrice;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private int categoryCode;


	// TO DO: set the column with proper annotations(컬럼 설정에 적합한 어노테이션 설정)

	private String orderableStatus;

	
	public Menu() {}

	public Menu(int menuCode, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
		super();
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.categoryCode = categoryCode;
		this.orderableStatus = orderableStatus;
	}

	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getOrderableStatus() {
		return orderableStatus;
	}

	public void setOrderableStatus(String orderableStatus) {
		this.orderableStatus = orderableStatus;
	}

	@Override
	public String toString() {
		return "Menu{" +
				"menuCode=" + menuCode +
				", menuName='" + menuName + '\'' +
				", menuPrice=" + menuPrice +
				", categoryCode=" + categoryCode +
				", orderableStatus='" + orderableStatus + '\'' +
				'}';
	}
}
