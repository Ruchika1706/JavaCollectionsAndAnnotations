package com.cisco.prj.dao;

import com.cisco.prj.entity.Employee;

public class EmployeeDaoMongoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee e) {
		System.out.println("Stored in NoSQL");

	}

	@Override
	public Employee getEmployee(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
