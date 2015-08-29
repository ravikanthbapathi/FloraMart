package com.floramart.sample.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NamedQueries({ @NamedQuery(name = "findByCategoryName", query = "from Category where categoryName = :categoryName") })

@Entity
@Table(name = "PRODUCT_CATEGORY", uniqueConstraints = { @UniqueConstraint(columnNames = { "PCAT_ID" }) })
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PCAT_ID", nullable = false, unique = true, length = 11)
	private Long categoryId;

	@Column(name = "PCAT_NAME", length = 20, nullable = true)
	private String categoryName;

	@Column(name = "PCAT_DESC", length = 20, nullable = true)
	private String categoryDescription;

	@OneToMany(mappedBy = "category")
	private Set<Product> products;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
