package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogBeforeService;

public class Client {
	public static void main(String[] args) {

		// create target
		Bank bank = new Bank();

		// create advice
		LogBeforeService lbs = new LogBeforeService();

		// add target+advice to proxy
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(bank);
		pfb.addAdvice(lbs);

		// get Generated proxy object
		Bank bProxcy = (Bank)pfb.getObject();
		int i = bProxcy.deposit(1000, "sbi123");
		System.out.println("Total Amount="+i);
	}

}
