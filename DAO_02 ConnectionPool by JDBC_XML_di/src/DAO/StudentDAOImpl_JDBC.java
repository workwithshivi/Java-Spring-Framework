package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import model.Student;


/*
 * we need to get the dao object in other classes and
 * use accordingly
 */

public class StudentDAOImpl_JDBC implements StudentDAO {
	// DataSource Object
	private static DataSource ds;

	public static void setDs(DataSource ds) {
		StudentDAOImpl_JDBC.ds = ds;
	}

	public int save(Student std) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1,std.getId());
		ps.setString(2, std.getName());
		ps.setString(3, std.getEmail());
		ps.setString(4, std.getAddress());
		int i = ps.executeUpdate();
		con.close();
		return i;
	}

	public boolean update(Student st) throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return false;
	}

	public boolean delete(Student st) throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return false;
	}

	public Student findById(int id) throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return null;
	}

	public Student findByName1(String name) throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return null;
	}

	public Student findByEmail1(String email) throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return null;
	}

	public List<Student> findAll() throws Exception {
		Connection con = ds.getConnection();
		// desired operation
		con.close();
		return null;
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(ds.getConnection());
	}

	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
