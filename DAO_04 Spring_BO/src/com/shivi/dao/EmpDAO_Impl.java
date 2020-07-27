package com.shivi.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.shivi.Model.Employee;

public class EmpDAO_Impl implements EmployeeDaoInterface {

	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}



	@Override
	public int save(Employee emp) {
		// TODO Auto-generated method stub
		return (int) ht.save(emp);
	}

	@Override
	public Employee find(int id) {
		// TODO Auto-generated method stub
		return ht.get(Employee.class, id);
	}

}
