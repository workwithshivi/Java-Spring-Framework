package beans;

public class Car {
	private static String name;
	
	public static void setName(String name) {
		Car.name = name;
	}
	
	public static void printData()
	
	{
		System.out.println("Car name:"+name);
	}

}
