package beans;

public class Car {
	private String name;
	private Engine engine;
	public void setName(String name) {
		this.name = name;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData()
	{
		System.out.println(name);
		System.out.println(engine.getModel());
	}
}
