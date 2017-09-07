package com.dineshonjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dineshonjava.model.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{


	 @Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Employee e) {
		sessionFactory.getCurrentSession().saveOrUpdate(e);
		
	}



}
