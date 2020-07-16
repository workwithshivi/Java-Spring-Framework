package model;

public class Student {
	private int id;
	private String name, address, email;

public Student(int id,String name,String address,String email) {
	this.id=id;
	this.name=name;
	this.email=email;
	this.address=address;
	
}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
