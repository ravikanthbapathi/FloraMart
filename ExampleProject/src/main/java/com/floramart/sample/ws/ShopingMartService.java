package com.floramart.sample.ws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.floramart.sample.dto.CreateProductRequest;
import com.floramart.sample.dto.CreateProductResponse;
import com.floramart.sample.dto.SearchProductRequest;
import com.floramart.sample.dto.SearchProductResponse;

@WebService(serviceName = "shopingMartService")
public interface ShopingMartService {

	public @WebResult(name = "CreateProductResponse") CreateProductResponse createProduct(
			@WebParam(name = "CreateProductRequest") CreateProductRequest productRequest);

	public @WebResult(name = "SearchProductResponse") SearchProductResponse listProducts(
			@WebParam(name = "SearchProductRequest") SearchProductRequest productRequest);

}