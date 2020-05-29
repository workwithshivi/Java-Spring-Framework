package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("res/spring.xml");
		Test test=(Test)ap.getBean("t");
		test.printData();
	}

}
