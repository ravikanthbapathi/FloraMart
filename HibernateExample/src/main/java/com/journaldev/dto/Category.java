package com.journaldev.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "CategoryName", required = false)
	private String categoryName;
	@XmlElement(name = "categoryDescription", required = false)
	private String categoryDescription;
	@XmlElement(name = "products", required = false)
	private List<Product> products;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
