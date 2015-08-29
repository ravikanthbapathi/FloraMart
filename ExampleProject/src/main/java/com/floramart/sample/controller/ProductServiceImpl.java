package com.floramart.sample.controller;

import java.util.List;

import com.floramart.sample.dao.CategoryDAO;
import com.floramart.sample.dao.ProductDAO;
import com.floramart.sample.dto.Product;
import com.floramart.sample.model.Category;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;
	private CategoryDAO categoryDAO;

	public void addProduct(Product product) {
		// TODO Auto-generated method stub

		Category searchCategory = getCategoryDAO().searchCategory(product.getCategoryName());
		if (searchCategory == null) {
			Category category = new Category();
			category.setCategoryName(product.getCategoryName());
			getCategoryDAO().addCategory(category);
			searchCategory = getCategoryDAO().searchCategory(product.getCategoryName());
		}

		com.floramart.sample.model.Product newProduct = new com.floramart.sample.model.Product();
		newProduct.setProductName(product.getProductName());
		newProduct.setProductDescription(product.getProductDescription());
		newProduct.setCurrency(product.getCurrency());
		newProduct.setPrice(product.getPrice());
		newProduct.setCategory(searchCategory);

		getProductDAO().addProduct(newProduct);

	}

	public Product searchProduct(String prodName) {
		com.floramart.sample.model.Product product = getProductDAO().searchProduct(prodName);

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

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

}
