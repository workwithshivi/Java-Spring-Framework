package com.shivi.bo;

import com.shivi.Model.Employee;

public interface EmpBOInterface {

	public int createEmployee(Employee emp);

	public Employee findEmployee(String id);
}
