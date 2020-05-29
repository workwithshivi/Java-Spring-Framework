package beans;

public class Car {
	private Engine engine;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData()
	{
		System.out.println("Car model year:"+engine.getModel());
	}

}
