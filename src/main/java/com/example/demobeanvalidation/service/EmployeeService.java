package com.example.demobeanvalidation.service;

import com.example.demobeanvalidation.dao.EmployeeDao;
import com.example.demobeanvalidation.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeDao.findAll();
    }

}
