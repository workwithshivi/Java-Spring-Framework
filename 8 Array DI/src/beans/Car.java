package beans;

public class Car {
	private String[] carName;
	private Engine[] engine;

	public String[] getCarName() {
		return carName;
	}

	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void printData() {
		for (String cars : carName) {
			System.out.println("Carname" + cars);
		}
		for(Engine e:engine)
		{
			System.out.println(e.getModelYear());
		}
	}
}
