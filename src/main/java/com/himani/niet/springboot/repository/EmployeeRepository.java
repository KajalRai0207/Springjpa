package com.himani.niet.springboot.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.himani.niet.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    ArrayList<Employee> findAll();
    
    @Transactional
    @Modifying
    @Query("update employee e set e.city = ?1 where e.id = ?2")
    int updateEmployeeCity(String city, long id);
}
