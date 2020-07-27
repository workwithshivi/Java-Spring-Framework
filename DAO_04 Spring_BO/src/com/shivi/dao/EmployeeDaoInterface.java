package com.shivi.dao;

import com.shivi.Model.Employee;

public interface EmployeeDaoInterface {
	public int save(Employee emp);

	public Employee find(String id);

}
