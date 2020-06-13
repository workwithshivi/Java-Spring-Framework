package beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {

	private String username, driver, password, url;
	private Connection con;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void createConnection() {
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
