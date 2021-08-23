package com.dampcave.spring.mvc_hibernate_aop.services;

import com.dampcave.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.dampcave.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional // открывает и закрывает сессии
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    @Transactional // открывает и закрывает сессии
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);

    }
}
