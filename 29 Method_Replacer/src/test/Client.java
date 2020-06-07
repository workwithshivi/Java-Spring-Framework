package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b = (Bank) ap.getBean("bank");
		b.deposite();
		b.withdwow();
		b.intrestCalculate();
	}

}
