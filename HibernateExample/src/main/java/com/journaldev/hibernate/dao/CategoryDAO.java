package com.journaldev.hibernate.dao;

import java.util.List;

import com.journaldev.hibernate.model.Category;

public interface CategoryDAO {
	public void addCategory(Category category);

	public List<Category> listCategories();

	public Category getCategory(Integer id);

	public Category searchCategory(String prodName);

	public void removeCategory(Category category);
}
