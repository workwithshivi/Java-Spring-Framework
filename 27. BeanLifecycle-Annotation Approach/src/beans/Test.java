package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.annotation.*;

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

	@PostConstruct
	public void conInit() throws Exception {
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
	
	@PreDestroy
	public void conCleanup() throws Exception {
		con.close();
		System.out.println("Connection closed.....");
	}

}
