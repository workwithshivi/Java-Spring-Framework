package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewInterestCalculator implements MethodReplacer{
	public Object reimplement(Object o, Method m, Object[] param) throws Throwable {
		System.out.println("New Claculate class new InterestCalculator");
		
		return null;
	}

}
