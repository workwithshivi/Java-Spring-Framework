package business;

import DAO.StudentDAO;
import model.Student;

public class StudentBOImpl implements StudentBO {
	
	private StudentDAO sDao;
	public void setsDao(StudentDAO sDao) {
		this.sDao = sDao;
	}

	public int createStudent(Student std) throws Exception {
		
		return sDao.save(std);
	}

	public boolean updateStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(Student std) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
