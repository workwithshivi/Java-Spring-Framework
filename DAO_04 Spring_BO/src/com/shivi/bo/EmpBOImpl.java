package com.shivi.bo;

import com.shivi.Model.Employee;
import com.shivi.dao.EmployeeDaoInterface;

public class EmpBOImpl implements EmpBOInterface {
	private EmployeeDaoInterface eDao;
	public void seteDao(EmployeeDaoInterface eDao) {
		this.eDao = eDao;
	}

	@Override
	public int createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return eDao.save(emp);
	}

	@Override
	public Employee findEmployee(String id) {
		// TODO Auto-generated method stub
		return eDao.find(id);
	}

}
