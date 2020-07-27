package test;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import DAO.StudentDAOImpl;
import model.Student;


public class Client {
	public static void main(String[] args) {
		try {
			
			ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
			StudentDAOImpl dao = (StudentDAOImpl) ap.getBean("dao");
			int l = dao.save(new Student(2, "ravi", "ravi.ymail.com", "goa"));
			System.out.println(l);
			ap.close();
		} catch (BeansException e) {

			e.printStackTrace();
		}

	}
}
