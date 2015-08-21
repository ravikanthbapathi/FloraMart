package com.journaldev.hibernate.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.journaldev.hibernate.model.Address;
import com.journaldev.hibernate.model.Employee;
import com.journaldev.hibernate.util.HibernateUtil;

public class HibernateAnnotationMain {

	private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public static void main(String[] args) {

		HibernateAnnotationMain main = new HibernateAnnotationMain();
		try {
			// Integer emp1 = main.createEmployee("Vineet Garg", 33, 9000.00d, "Mayfield Garden", "Gurgaon", "India");
			// System.out.println("Employee Created = " + emp1);

			// Display Employee
			System.out.println("GET ::: " + main.getEmployee(5));

			System.out.println("LOAD ::: " + main.loadEmployee(2));

			main.mergeEmployee(5, 20000d);

			System.out.println("LOAD ::: " + main.loadEmployee(5));
			// remove the employee
			// main.removeEmployee(3);

			// List all Employee
			// List<Employee> employees = main.listEmployees();
			// System.out.println(employees);

		} finally { // closing the session factory
			sessionFactory.close();
		}
	}

	private void removeEmployee(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.get(Employee.class, id);

		session.delete(employee);

		session.getTransaction().commit();

	}

	private List<Employee> listEmployees() {
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

	private Employee getEmployee(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.get(Employee.class, id);
		session.getTransaction().commit();
		return employee;

	}

	private Employee loadEmployee(Integer id) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Employee employee = (Employee) session.load(Employee.class, id);
		session.getTransaction().commit();
		return employee;

	}

	private void mergeEmployee(Integer id, Double updatedSalary) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		Employee emp = (Employee) session.load(Employee.class, id);
		session.getTransaction().commit();

		emp.setSalary(updatedSalary);

		session.getTransaction().begin();

		Employee emp1 = (Employee) session.merge(emp);
		System.out.println(emp1 == emp);
		emp.setAge(44);
		emp1.setAge(54);

		System.out.println("15. Before committing merge transaction");
		session.getTransaction().commit();
		System.out.println("16. After committing merge transaction");

	}

	private Integer createEmployee(String name, Integer age, Double salary, String street, String city, String country) {
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
		session.save(emp);
		// Commit transaction
		session.getTransaction().commit();

		System.out.println("Employee ID=" + emp.getId() + "\t, ADD_ID=" + emp.getAddress().getId());
		return emp.getId();
	}
}
