package beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;



public class Car {
	
	
	/* 
	 * Inject or resource annotation are rechamonded 
	 * because the are  given by SON 
	 * we can change our application to EJB based from spring 
	 * we just need to change spring annotation to sun given annotation
	 * */
	@Qualifier(value = "e1")
	@Inject
	private Engine engine;
	// no need to have any setter or constructor
	
	public void printData()
	{

		System.out.println("Car model year:"+engine.getModel());
	}

}
