package com.journaldev.controller;

import java.util.List;

import com.journaldev.dto.Product;

public interface ProductService {

	public void addProduct(Product product);

	public Product searchProduct(String prodName);

	public void updateProduct(Product emp);

	public List<Product> listProducts();
}
