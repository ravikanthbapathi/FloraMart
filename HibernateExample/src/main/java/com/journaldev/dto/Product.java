package com.journaldev.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "ProductName", required = false)
	private String productName;
	@XmlElement(name = "ProductDescription", required = false)
	private String productDescription;
	@XmlElement(name = "Currency", required = false)
	private String currency;
	@XmlElement(name = "Price", required = false)
	private Double price;
	@XmlElement(name = "CategoryName", required = false)
	private String categoryName;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
