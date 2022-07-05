package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
		
}