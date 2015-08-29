package com.floramart.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NamedQueries({ @NamedQuery(name = "findByProductName", query = "from Product where productName = :productName") })

@Entity
@Table(name = "PRODUCT", uniqueConstraints = { @UniqueConstraint(columnNames = { "PROD_ID" }) })
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROD_ID", nullable = false, unique = true, length = 11)
	private Long productId;

	@Column(name = "PROD_NAME", length = 20, nullable = true)
	private String productName;

	@Column(name = "PROD_DESC", length = 20, nullable = true)
	private String productDescription;

	@Column(name = "PROD_CURR", length = 20, nullable = true)
	private String currency;

	@Column(name = "PROD_PRICE")
	private Double price;

	// private Category category;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	// public Category getCategory() {
	// return category;
	// }
	//
	// public void setCategory(Category category) {
	// this.category = category;
	// }
	//
}
