package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LoginExceptionService implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		Log log = LogFactory.getLog(Bank.class);
		log.info("In case of exception in deposit***");

	}

}
