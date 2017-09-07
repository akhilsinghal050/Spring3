package com.dineshonjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.dao.EmployeeDao;
import com.dineshonjava.model.Employee;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	
	 @Autowired
	 private EmployeeDao employeeDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
		
	}


}
