package controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello "+name);
		ModelAndView mav = new ModelAndView("success", m);
System.out.println("HelloController "+name);
	PrintWriter o = res.getWriter();
	o.print("HelloController "+name);
		return mav;
	}

}
