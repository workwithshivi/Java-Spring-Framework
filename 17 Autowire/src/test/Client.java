package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {

	public static void main(String[] args) {
		//Autowire by type
		//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring-byType.xml");
			
		//autowire byName
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring-byName.xml");
		Car ob = (Car)ap.getBean("c");
		ob.printData();
		
		//autowire by constructor
		//ApplicationContext ap3=new ClassPathXmlApplicationContext("resources/spring-constructor.xml");
		
		ApplicationContext ap3=new ClassPathXmlApplicationContext("resources/spring-autodetect.xml");
		Bus ob3=(Bus)ap3.getBean("b");
		ob3.printData();
		
	
	}

}
