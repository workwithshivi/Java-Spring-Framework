package beans;

public class Test {
	private String name;
	private int age;
	private String email;



	public Test(String name, int age, String email) {
	
		this.name = name;
		this.age = age;
		this.email = email;
	}



	public void printyData() {
		System.out.println("Hello.." + name + "  " + age + "  " + email);
	}
}
