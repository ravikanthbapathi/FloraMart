package com.journaldev.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SearchProductRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchProductRequest {

	@XmlElement(name = "ProductName", required = true)
	private String productName;

	public SearchProductRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
