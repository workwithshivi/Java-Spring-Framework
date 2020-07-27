package service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import business.Bank;

//this code will execute before and after the business
public class LogAroundService implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		Log log = LogFactory.getLog(Bank.class);
		log.info("Before diposit ***");

		Object ob = mi.proceed();
		log.info("After diposit ***");
		return ob;
	}

}
