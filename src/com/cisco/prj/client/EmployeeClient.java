package com.cisco.prj.client;

import com.cisco.prj.dao.EmployeeDao;
import com.cisco.prj.dao.EmployeeDaoFactory;
import com.cisco.prj.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee e = new Employee();
//		EmployeeDao empDao = new EmployeeDaoMySqlImpl();
//		EmployeeDao empDao2 = new EmployeeDaoMongoImpl();
		EmployeeDao empDao = EmployeeDaoFactory.getEmployeeDao();
		empDao.addEmployee(e);
//		empDao2.addEmployee(e);
	}
}
