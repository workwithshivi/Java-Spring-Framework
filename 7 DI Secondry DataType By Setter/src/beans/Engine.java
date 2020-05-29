package beans;

public class Engine {
	private String modelYear;

	public Engine() {
		System.out.println("Engine...");
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getModelYear() {
		return modelYear;
	}

}
