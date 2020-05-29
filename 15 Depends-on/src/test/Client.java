package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	//ap.getBean("c");
	}
}
