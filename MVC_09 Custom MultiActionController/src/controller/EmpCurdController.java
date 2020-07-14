package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpCurdController extends MultiActionController {

	/*
	 * In custom multiAction we add Shivi prefix and CURD suffix with the action
	 * name so we need to implement a class "MethodNameResolver" have 2 methods
	 * setSuffix and setPreffix which add suffix and prefix part to all the actions
	 */
	public ModelAndView ShiviempsaveCURD(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "74484");
		PreparedStatement ps = con.prepareStatement("select max(id) from Employee");
		ResultSet rs = ps.executeQuery();
		int maxId = 0;
		if (rs.next()) {
			maxId = rs.getInt(1);
			maxId++;
		}
		ps = con.prepareStatement("insert into Employee values(?,?,?,?)");
		ps.setInt(1, maxId);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		int i = ps.executeUpdate();
		con.close();
		ModelAndView mav = null;
		if (i != 0)
			mav = new ModelAndView("success");
		else {
			mav = new ModelAndView("failed");
		}
		return mav;

	}

	public ModelAndView ShiviempupdateCURD(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "74484");

		PreparedStatement ps = con.prepareStatement("update Employee set name=?,email=?,address=? where id=?");

		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, address);
		ps.setInt(4, id);
		int i = ps.executeUpdate();
		con.close();
		ModelAndView mav = null;
		if (i != 0)
			mav = new ModelAndView("success");
		else {
			mav = new ModelAndView("failed");
		}
		return mav;
	}

}
