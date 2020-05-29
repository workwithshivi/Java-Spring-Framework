package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	public static void main(String[] args) {
		
		//for multiple xml file create an array of file paths
		
		  String files[]=new String[] {"resources/car.xml","resources/engine.xml"};
		  ApplicationContext ap=new ClassPathXmlApplicationContext(files);
		 
		//check both xml and instanciate
		
		
		  // for single xml file
		//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car-engine.xml");
		
		Car car=(Car)ap.getBean("c");
		car.printCarData();
		
	}

}
