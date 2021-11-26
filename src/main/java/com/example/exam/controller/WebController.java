package com.example.exam.controller;

import com.example.exam.entity.Employee;
import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/","/index"})
    public String index(Model model) {
        List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @RequestMapping(value = "add")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @PostMapping("/save")
    public String save(Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/";
    }
}
