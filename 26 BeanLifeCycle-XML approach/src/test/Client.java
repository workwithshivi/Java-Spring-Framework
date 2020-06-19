package test;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("resaurces/spring.xml");
		Test t = (Test) cac.getBean("t");
		// t.save(id, name, email, address);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Save\n2.close");
			int i = sc.nextInt();
			int id;
			String name;
			String email;
			String address;
			switch (i) {
			case 1:
				System.out.println("ID:");
				id = sc.nextInt();
				System.out.println("Name:");
				name = sc.next();
				System.out.println("Email:");
				email = sc.next();
				System.out.println("Address:");
				address = sc.next();

				t.save(id, name, email, address);

				break;
			case 2:

				cac.close();
				/*
				 * ConfigurableApplicationContext close() method is used to destroy all
				 * initialized methods. it initiate garbage collector to destroy all the objects
				 */ break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
			sc.close();

		}
	}

}
