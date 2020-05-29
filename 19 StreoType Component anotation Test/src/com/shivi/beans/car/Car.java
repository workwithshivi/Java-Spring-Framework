package com.shivi.beans.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shivi.beans.engine.Engine;
@Component
public class Car {

	@Autowired
	private Engine engine;

	public void printData() {

		System.out.println("Car model year:" + engine.getModel());
	}

}
