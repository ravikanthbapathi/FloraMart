package com.journaldev.controller;

import java.util.List;

import com.journaldev.dto.Product;
import com.journaldev.hibernate.dao.ProductDAO;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		com.journaldev.hibernate.model.Product newProduct = new com.journaldev.hibernate.model.Product();
		newProduct.setProductName(product.getProductName());
		newProduct.setProductDescription(product.getProductDescription());
		newProduct.setCurrency(product.getCurrency());
		newProduct.setPrice(product.getPrice());

		getProductDAO().addProduct(newProduct);

	}

	public Product searchProduct(String prodName) {
		com.journaldev.hibernate.model.Product product = getProductDAO().searchProduct(prodName);

		Product foundProduct = new Product();
		foundProduct.setProductName(product.getProductName());
		foundProduct.setProductDescription(product.getProductDescription());
		foundProduct.setCurrency(product.getCurrency());
		foundProduct.setPrice(product.getPrice());
		return foundProduct;
	}

	public void updateProduct(Product emp) {
		// TODO Auto-generated method stub

	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}
