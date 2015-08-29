package com.journaldev.ws;

import java.util.ArrayList;
import java.util.List;

import com.journaldev.controller.ProductService;
import com.journaldev.dto.CreateProductRequest;
import com.journaldev.dto.CreateProductResponse;
import com.journaldev.dto.Product;
import com.journaldev.dto.SearchProductRequest;
import com.journaldev.dto.SearchProductResponse;

public class ShopingMartServiceImpl implements ShopingMartService {

	private ProductService productService;

	public CreateProductResponse createProduct(CreateProductRequest productRequest) {

		Product product = productRequest.getProduct();
		getProductService().addProduct(product);

		CreateProductResponse response = new CreateProductResponse();
		response.setSuccess(true);
		return response;
	}

	public SearchProductResponse listProducts(SearchProductRequest productRequest) {
		String prodName = productRequest.getProductName();

		Product searchProduct = getProductService().searchProduct(prodName);
		List<Product> products = new ArrayList<Product>();
		products.add(searchProduct);

		SearchProductResponse response = new SearchProductResponse();
		response.setFound(true);
		response.setProducts(products);

		return response;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
