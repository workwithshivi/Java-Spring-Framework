package business;

import model.Student;

public interface StudentBO {
	public int createStudent(Student std) throws Exception;
	public boolean updateStudent(Student std) throws Exception;
	public boolean deleteStudent(Student std) throws Exception;

}
