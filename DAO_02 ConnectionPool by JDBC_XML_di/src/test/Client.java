package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBO;
import model.Student;

public class Client {
	public static void main(String[] args) throws Exception{
		ApplicationContext cfc=new ClassPathXmlApplicationContext("resources/springJDBC.xml");
		StudentBO stdBo=(StudentBO)cfc.getBean("bo");
		int i = stdBo.createStudent(new Student(1,"amit","amit@g.com","meerut"));
		System.out.println(i);
		
	}

}
