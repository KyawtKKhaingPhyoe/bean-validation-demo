package com.example.demobeanvalidation.dao;

import com.example.demobeanvalidation.ds.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {



}
