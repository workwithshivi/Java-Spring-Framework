package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class HelloController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		Map m = new HashMap();
		m.put("msg", "Hello ParameterizableViewController " + name);
		ModelAndView mav = new ModelAndView(getViewName(), m);
		// need to pass view name from spring xml file (setter DI)

		return mav;
	}

}
