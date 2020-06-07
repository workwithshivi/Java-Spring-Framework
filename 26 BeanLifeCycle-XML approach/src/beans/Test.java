package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	private String username, driver, password, url;
	private Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * this method is similar to init() which is an abstract method of
	 * InitializingBean
	 */

	public void init() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Opened.....");

	}

	public void save(int id, String name, String email, String address) throws Exception {
		PreparedStatement ps = con.prepareStatement("insert into Student1 values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		ps.executeUpdate();
		System.out.println("Insertion Success...");
	}

	/* abstract method of DisposableBean */

	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection closed.....");
	}

}
