package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	@Required
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	public void printConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println(con);

	}

}
