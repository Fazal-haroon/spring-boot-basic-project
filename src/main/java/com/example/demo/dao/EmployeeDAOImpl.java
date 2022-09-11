package com.example.demo.dao;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    List<Employee> employees = new ArrayList<>();

    @Override
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        for(Employee emp : employees){
            if(emp.getEmpId() == id){
                return emp;
            }
        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {
        for(Employee employee : employees){
            if(employee.getEmpId() == id){
                employees.remove(employee);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int updateEmployee(int id, Employee employee) {
        for(Employee emp : employees){
            if (emp.getEmpId() == id){
                emp.setEmpId(employee.getEmpId());
                emp.setEmpName(employee.getEmpName());
                return 1;
            }
        }
        return 0;
    }
}
