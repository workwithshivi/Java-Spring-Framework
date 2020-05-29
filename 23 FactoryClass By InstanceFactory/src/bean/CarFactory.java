package bean;

public class CarFactory {
	public String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/* 
	 * non-ststic factory or instance Factory
	 */

	public Car getRefrence() throws Exception {
		return (Car) Class.forName(carName).getDeclaredConstructor().newInstance();

	}
}
