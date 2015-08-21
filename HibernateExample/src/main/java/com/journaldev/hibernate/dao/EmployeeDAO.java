package com.journaldev.hibernate.dao;

import java.util.List;

import com.journaldev.hibernate.model.Employee;

public interface EmployeeDAO {

	public void createEmployee(String name, Integer age, Double salary, String street, String city, String country);

	public List<Employee> listEmployees();

	public Employee getEmployee(Integer id);

	public Employee loadEmployee(Integer id);

	public void removeEmployee(Integer id);

	public void updateEmployee(Employee emp);

}
