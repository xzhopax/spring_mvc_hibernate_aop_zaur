package com.dampcave.spring.mvc_hibernate_aop.services;

import com.dampcave.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);
}
