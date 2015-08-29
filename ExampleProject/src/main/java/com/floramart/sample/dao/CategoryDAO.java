package com.floramart.sample.dao;

import java.util.List;

import com.floramart.sample.model.Category;

public interface CategoryDAO {
	public void addCategory(Category category);

	public List<Category> listCategories();

	public Category getCategory(Integer id);

	public Category searchCategory(String prodName);

	public void removeCategory(Category category);
}
