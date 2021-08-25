package com.dampcave.spring.mvc_hibernate_aop.controllers;

import com.dampcave.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.dampcave.spring.mvc_hibernate_aop.entity.Employee;
import com.dampcave.spring.mvc_hibernate_aop.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> allEmployees = employeeService.getAllEmployee();

        model.addAttribute("allEmp", allEmployees);

        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-info";
    }

//    @ModelAttribute("employee") Employee employee - берем из model.addAttribute("employee", employee);
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){

            Employee employee = employeeService.getEmployee(id);
            model.addAttribute("employee",employee);

        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){

         employeeService.deleteEmployee(id);

        return "redirect:/";
    }
}
