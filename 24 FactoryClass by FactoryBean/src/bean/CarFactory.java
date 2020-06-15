package bean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean {

	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	
	public Object getObject() throws Exception {
		Car c = (Car) Class.forName(carName).getDeclaredConstructor().newInstance();

		return c;
	}


	public Class getObjectType() {
		return Car.class;
	}

	
	public boolean isSingleton() {
		/* true: for singleton Object
		 * false: for new object om every request */
		return true;
	}

}
