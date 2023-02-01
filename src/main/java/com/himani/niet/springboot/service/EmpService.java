package com.himani.niet.springboot.service;

import java.util.ArrayList;

import com.himani.niet.springboot.model.Employee;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
    void deleteById(long id);
    void updateEmployeeCity(long id, String city);
}
