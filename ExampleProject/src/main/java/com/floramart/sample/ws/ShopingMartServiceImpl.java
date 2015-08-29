package com.floramart.sample.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.floramart.sample.controller.ProductService;
import com.floramart.sample.dto.CreateProductRequest;
import com.floramart.sample.dto.CreateProductResponse;
import com.floramart.sample.dto.Product;
import com.floramart.sample.dto.SearchProductRequest;
import com.floramart.sample.dto.SearchProductResponse;

public class ShopingMartServiceImpl implements ShopingMartService {

	@Autowired
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
