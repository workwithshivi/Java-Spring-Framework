package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	Test t=(Test)ap.getBean("t");
	try {
		t.printConnection();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
