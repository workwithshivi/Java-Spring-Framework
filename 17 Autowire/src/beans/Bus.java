package beans;

/*
 * if a class contains default con with setter the autodetect will go with setter DI
 *  if no default constructor but there is setter go with constructor DI
 *  otherwise con DI
 * */
public class Bus {
	private Engine engine;
	
	public Bus() {
		System.out.println("Bus Default constructor");
	}
	
	
	public Bus(Engine engine) {
		System.out.println("Bus parameterise constructor");
		this.engine=engine;
	}
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
public void printData() {
	System.out.println("Bus model year:"+engine.getModel());
	
}

}
