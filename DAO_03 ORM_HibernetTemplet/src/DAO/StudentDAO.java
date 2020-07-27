package DAO;

import java.util.List;

import model.Student;



public interface StudentDAO {
	public int save(Student st);

	public boolean update(Student st);

	public boolean delete(Student st);

	public Student findByPK(int pk);

	public List<Student> findAllUsingHQL(Student st);

	public List<Student> findAllUsingCriteria(Student st);

}
