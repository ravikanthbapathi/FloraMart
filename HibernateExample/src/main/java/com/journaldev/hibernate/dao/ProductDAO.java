package com.journaldev.hibernate.dao;

import java.util.List;

import com.journaldev.hibernate.model.Product;

public interface ProductDAO {

	public void addProduct(Product product);

	public Product getProduct(Integer id);

	public Product searchProduct(String prodName);

	public void removeProduct(Integer id);

	public void updateProduct(Product emp);

	public List<Product> listProducts();

}
