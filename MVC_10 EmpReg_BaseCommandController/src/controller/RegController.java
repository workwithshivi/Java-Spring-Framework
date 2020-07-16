package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")  //this annotation is used to avoid "deprecation" warning
public class RegController extends SimpleFormController 
{
	public RegController() 
	{
		System.out.println("RegController");
		setCommandName("form");
		setCommandClass(FormBean.class);
		setValidator(new FormValidator());
		// if there is an error in validation data will redirect to given blew form view
		setFormView("index");
	}

	// After Completion Of validation if there is no error onSubmit method will
	// execute

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("**********");
		FormBean f = (FormBean) command;
		System.out.println(f.getName() + " - " + f.getEmail() + " - " + f.getAddress());
		return new ModelAndView("success");
	}

}
