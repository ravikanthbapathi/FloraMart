package com.floramart.sample.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SearchCategoryRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchCategoryRequest {

	@XmlElement(name = "CategoryName", required = false)
	private String categoryName;

	public SearchCategoryRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
