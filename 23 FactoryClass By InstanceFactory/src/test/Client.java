package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	Car ob = (Car)ap.getBean("c");
	ob.drive();
	}

}
