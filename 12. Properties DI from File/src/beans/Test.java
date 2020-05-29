package beans;

import java.util.Properties;
import java.util.Set;

public class Test {
	private Properties driver;
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	public void printData()
	{
		Set keys = driver.keySet();
		for(Object key:keys)
		{
			System.out.println(key.toString()+":"+driver.getProperty(key.toString()));
		}
	}

}
