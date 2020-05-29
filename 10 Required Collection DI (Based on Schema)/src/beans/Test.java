package beans;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeSet cricketers;
	private HashMap cc;

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}

	public void setCc(HashMap cc) {
		this.cc = cc;
	}

	

	public void printData() {
		System.out.println("=====FRUITS=======");
		for (Object l : fruits) {
			System.out.println(l);
		}
		System.out.println("=====CRICKETERS=======");
		for (Object s : cricketers) {
			System.out.println(s);
		}

		System.out.println("=====CC=====");
		Set keys=cc.keySet();
		
		for (Object key : keys) {
			System.out.println("Country: "+key+" Capital:"+cc.get(key) );
		}
	}
}
