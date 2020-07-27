package com.shivi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shivi.Model.Employee;
import com.shivi.bo.EmpBOInterface;

public class EmpSaveController extends HttpServlet {
	ConfigurableApplicationContext cfg;

	@Override
	public void init() throws ServletException {
		cfg = new ClassPathXmlApplicationContext("resources/spring.xml");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		// send data to business
		EmpBOInterface bo=(EmpBOInterface)cfg.getBean("empBO");
		
		int i = bo.createEmployee(new Employee(id,name,email,address));
		if(i!=0)
		{
			response.getWriter().print("SUCCESS");
		}
		else
			response.getWriter().print("SUCCESS");
		
		
	}
	@Override
	public void destroy() {
		cfg.close();
	}

}
