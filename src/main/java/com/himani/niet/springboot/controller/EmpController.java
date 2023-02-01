package com.himani.niet.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.himani.niet.springboot.model.Employee;
import com.himani.niet.springboot.service.EmpServiceImpl;

@RestController
public class EmpController {
    
    @Autowired
    EmpServiceImpl empServiceImpl;
  
    @GetMapping("/add")
    public String add() {
        empServiceImpl.addEmployee();
        return "Employees Data Added Successfully";
    }
  
    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }
  
    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
  
    @GetMapping("/delete")
    public String delete() {
        empServiceImpl.deleteAllData();
        return "All Employees data deleted successfully";
    }
    
    @GetMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable long id) {
        empServiceImpl.deleteById(id);
        return "Employee with id "+id+" deleted successfully";
    }
    
    @GetMapping("/updateEmp")
    public String updateCity(@RequestParam long id, @RequestParam String city) {
        empServiceImpl.updateEmployeeCity(id, city);
        return "Employee city with id "+id+" updated successfully";
    }
}
