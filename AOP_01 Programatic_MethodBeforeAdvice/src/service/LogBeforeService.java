package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	public void before(Method m, Object[] param, Object ob) throws Throwable {
		
		Log log = LogFactory.getLog(Bank.class);
		log.info("diposit method***");
		

	}

}
