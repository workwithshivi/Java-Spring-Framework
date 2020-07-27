package beans;

import java.sql.Connection;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Test {
	public static void main(String[] args) {

		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("org.postgresql.Driver");
		bds.setUrl("jdbc:postgresql://localhost:5432/postgres");
		bds.setUsername("postgres");
		bds.setPassword("74484");
		bds.setMaxActive(15);
		bds.setMinIdle(5);
		bds.setMaxWait(5000);
		
		for(int i=0;i<20;i++)
	
			try {
				Connection con=bds.getConnection();
				System.out.println(con+" : "+i);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


