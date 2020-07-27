package DAO;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDAOImpl implements StudentDAO {
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public int save(Student st) {

		return (Integer) ht.save(st);
	}

	public boolean update(Student st) {
		ht.update(st);
		return true;
	}

	public boolean delete(Student st) {
		ht.delete(st);
		return false;
	}

	public Student findByPK(int pk) {
		Student std = ht.get(Student.class, pk);
		return std;
	}

	public List<Student> findAllUsingHQL(Student st) {

		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) ht.find("from Student");
		return list;
	}

	public List<Student> findAllUsingCriteria(Student st) {
		DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
		/*
		 * ***In case if you want to add any projections or restrictions***
		 * dc.setProjection(projection); 
		 * dc.add(criterion);
		 * 
		 */
		List<Student> list = (List<Student>) ht.findByCriteria(dc);
		return list;
	}

}
