package com.example.demo.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void addNewValue(List<Employee> employee) {
        employeeRepository.saveAll(employee);
    }
    public List<Employee> getAllList() {
        return employeeRepository.findAll();
    }
}
