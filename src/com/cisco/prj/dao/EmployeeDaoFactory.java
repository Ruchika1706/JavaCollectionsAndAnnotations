package com.cisco.prj.dao;

import java.util.ResourceBundle;

public class EmployeeDaoFactory {
	private static String NAME = "";
	static {
		ResourceBundle res = ResourceBundle.getBundle("config");
		NAME = res.getString("EMP_DAO1");
	}
	
	public static EmployeeDao getEmployeeDao() {
//		return new EmployeeDaoMySqlImpl();
		try {
			return(EmployeeDao) Class.forName(NAME).newInstance();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
