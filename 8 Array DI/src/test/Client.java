package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("res/spring.xml");
	Car car=(Car)ap.getBean("c");
	car.printData();
}
}
