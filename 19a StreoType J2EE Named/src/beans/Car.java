package beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Car {

	@Inject
	private Engine engine;
	
	public void printData()
	{
		System.out.println("Engine:"+engine.getEngineName());
	}

}
