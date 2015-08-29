package com.floramart.sample.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SearchCategoryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchCategoryResponse {

	private boolean found;
	@XmlElement(name = "categories", required = false)
	private List<Category> categories;

	public SearchCategoryResponse() {
		// TODO Auto-generated constructor stub
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
