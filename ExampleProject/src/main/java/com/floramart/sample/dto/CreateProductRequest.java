package com.floramart.sample.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CreateProductRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateProductRequest {
	@XmlElement(name = "product", required = true)
	private Product product;

	public CreateProductRequest() {
		// TODO Auto-generated constructor stub
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
