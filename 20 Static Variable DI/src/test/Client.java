package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	private static ApplicationContext ap;

	public static void main(String[] args) {
		ap = new ClassPathXmlApplicationContext("res/spring.xml");
		Car car = (Car) ap.getBean("c");
		car.printData();
	}
}
