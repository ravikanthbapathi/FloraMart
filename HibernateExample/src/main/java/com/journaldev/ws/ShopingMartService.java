package com.journaldev.ws;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.journaldev.dto.CreateProductRequest;
import com.journaldev.dto.CreateProductResponse;
import com.journaldev.dto.SearchProductRequest;
import com.journaldev.dto.SearchProductResponse;

@WebService(serviceName = "shopingMartService")
public interface ShopingMartService {

	public @WebResult(name = "CreateProductResponse") CreateProductResponse createProduct(
			@WebParam(name = "CreateProductRequest") CreateProductRequest productRequest);

	public @WebResult(name = "SearchProductResponse") SearchProductResponse listProducts(
			@WebParam(name = "SearchProductRequest") SearchProductRequest productRequest);

}