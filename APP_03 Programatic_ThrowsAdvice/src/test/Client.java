package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LoginExceptionService;

public class Client {
	public static void main(String[] args) {

		// create target
		Bank bank = new Bank();

		// create advice
		LoginExceptionService lexs = new LoginExceptionService();

		// add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(lexs);

		// get Generated proxy object
		Bank bProxcy = (Bank) pfb.getObject();
		// throws exception if acc no is wrong then Service method will execute
		int i = bProxcy.deposit(1000, "sbi123");
		System.out.println("Total Amount=" + i);
	}

}
