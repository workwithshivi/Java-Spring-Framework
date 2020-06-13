package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("resources/spring.xml");
		BeanFactory fact=new XmlBeanFactory(res); 
		// document validation is done in above line xml should be valid and well formed
		System.out.println("Document Valid");
		fact.getBean("t"); //
	}

}



//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
//check xml and 
//it will create instances to singleton beans