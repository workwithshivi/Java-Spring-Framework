package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Car;


public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car t=(Car)ap.getBean("c");
		t.printData();
		
		/*
		 * Resource r=new ClassPathResource("resources/spring.xml"); BeanFactory
		 * fact=new XmlBeanFactory(r);
		 * 
		 * Test t=(Test)fact.getBean("t"); t.hello("Shivam");
		 */
	}
}
