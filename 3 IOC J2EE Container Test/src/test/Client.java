package test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {

		try {
			 ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
			// check xml and
			// it will create instances to singleton beans if scope is singleton
			//if scope is prototype then we need to request for instances
			//ap.getBean("t");
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			System.out.println("************************");
			e.printStackTrace();
		}
	}

}
