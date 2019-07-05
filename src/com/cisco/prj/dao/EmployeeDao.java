package com.cisco.prj.dao;

import com.cisco.prj.entity.Employee;

public interface EmployeeDao {
	void addEmployee(Employee e);
	Employee getEmployee(String email);
}
