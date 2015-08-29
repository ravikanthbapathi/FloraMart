package com.floramart.sample.controller;

import java.util.List;

import com.floramart.sample.dto.Product;

public interface ProductService {

	public void addProduct(Product product);

	public Product searchProduct(String prodName);

	public void updateProduct(Product emp);

	public List<Product> listProducts();
}
