package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t=(Test)ap.getBean("t");
		t.printyData();
		
		/*
		 * Resource r=new ClassPathResource("resources/spring.xml"); BeanFactory
		 * fact=new XmlBeanFactory(r);
		 * 
		 * Test t=(Test)fact.getBean("t"); t.hello("Shivam");
		 */
	}
}
 