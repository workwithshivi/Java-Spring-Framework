package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {
	@Qualifier(value="e2")
	@Autowired
	private Engine engine;
	// no need to have any setter or constructor
	
	public void printData()
	{

		System.out.println("Car model year:"+engine.getModel());
	}

}
