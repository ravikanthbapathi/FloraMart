package com.journaldev.hibernate.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.Address;
import com.journaldev.hibernate.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void createEmployee(String name, Integer age, Double salary, String street, String city, String country) {
		Address address = new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setCountry(country);

		Employee emp = new Employee();
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		emp.setAddress(address);

		// Get Session
		Session session = sessionFactory.getCurrentSession();
		// start transaction
		session.beginTransaction();

		// Save the Model object
		session.persist(emp);

		// Commit transaction
		session.getTransaction().commit();

		System.out.println("Employee ID=" + emp.getId() + "\t, ADD_ID=" + emp.getAddress().getId());
	}

	public List<Employee> listEmployees() {
		Session session = sessionFactory.getCurrentSession();

		session.getTransaction().begin();

		List employees = session.createQuery("from Employee").list();

		// List employees = session.createCriteria(Employee.class).list();

		Iterator itr = employees.iterator();
		List<Employee> employeeList = new ArrayList<Employee>();

		while (itr.hasNext()) {
			employeeList.add((Employee) itr.next());
		}

		session.getTransaction().commit();
		return employeeList;

	}

	public Employee getEmployee(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.get(Employee.class, id);
		session.getTransaction().commit();
		return employee;
	}

	public Employee loadEmployee(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.load(Employee.class, id);
		session.getTransaction().commit();
		return employee;
	}

	public void removeEmployee(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.get(Employee.class, id);

		session.delete(employee);

		session.getTransaction().commit();
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

}
