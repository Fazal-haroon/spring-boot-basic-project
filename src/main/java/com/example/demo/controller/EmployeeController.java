package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public int addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.employeeList();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/{id}")
    public int deleteEmployee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/{id}")
    public int updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

}
