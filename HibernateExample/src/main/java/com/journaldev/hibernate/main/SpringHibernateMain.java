package com.journaldev.hibernate.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.hibernate.dao.EmployeeDAO;
import com.journaldev.hibernate.model.Employee;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		// employeeDAO.createEmployee("Monty", 34, 10000d, "Mayfield Garden", "Gurgaon", "India");

		Employee employee = employeeDAO.getEmployee(4);
		System.out.println(employee);

		// List<Employee> employees = employeeDAO.listEmployees();
		// System.out.println(employees);

		context.close();

	}
}
