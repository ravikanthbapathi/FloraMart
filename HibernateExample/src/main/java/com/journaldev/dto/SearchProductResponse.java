package com.journaldev.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SearchProductResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchProductResponse {
	private boolean found;
	@XmlElement(name = "products", required = false)
	private List<Product> products;

	public SearchProductResponse() {
		// TODO Auto-generated constructor stub
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
