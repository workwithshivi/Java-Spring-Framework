package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try {
			Class c=Class.forName("beans.Test");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			
			con[0].newInstance(null);
			//his same approch is used bu both spring containers
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
