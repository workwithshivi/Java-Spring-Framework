package bean;

/*factory class is use to make class independent
 * to other class
 * best Example is DriverManage i.e. used for connection
*/




public class CarFactory {
	public static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}

	/*
	 * this is used to make object singleton 
	 * but in spring there is no need to make
	 * object singleton cause it provide by default singleton object
	 */
	
	public static Car getRefrence() throws Exception {
		return (Car) Class.forName(carName).getDeclaredConstructor().newInstance();

	}
}
