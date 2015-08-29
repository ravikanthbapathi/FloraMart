package com.floramart.sample.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.floramart.sample.model.Category;
import com.floramart.sample.model.Product;

public class ProductCategoryDAOImpl implements ProductDAO, CategoryDAO {

	private SessionFactory sessionFactory;

	public void addCategory(Category category) {
		// TODO Auto-generated method stub

	}

	public List<Category> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategory(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Category searchCategory(String prodName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeCategory(Category category) {
		// TODO Auto-generated method stub

	}

	public void addProduct(Product product) {
		// Get Session
		Session session = getSessionFactory().getCurrentSession();
		// start transaction
		session.beginTransaction();

		// Save the Model object
		session.persist(product);

		// Commit transaction
		session.getTransaction().commit();

		System.out.println("Product ID=" + product.getProductId() + "\t, Name=" + product.getProductName());
	}

	public Product getProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product searchProduct(String prodName) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();

		Query query = session.getNamedQuery("findByProductName");
		query.setParameter("productName", prodName);
		List<Product> proudctList = query.list();

		Product searchedProduct = null;
		if (proudctList != null && !proudctList.isEmpty()) {
			searchedProduct = proudctList.get(0);
		}

		session.getTransaction().commit();
		return searchedProduct;
	}

	public void removeProduct(Integer id) {
		// TODO Auto-generated method stub

	}

	public void updateProduct(Product emp) {
		// TODO Auto-generated method stub

	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
