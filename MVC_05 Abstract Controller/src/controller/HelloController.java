package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		Map m = new HashMap();
		m.put("msg", "Hello abstractController " + name);
		ModelAndView mav = new ModelAndView("success", m);

		return mav;
	}

}
