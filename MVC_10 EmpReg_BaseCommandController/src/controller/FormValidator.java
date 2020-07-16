package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void validate(Object form, Errors error) {
		FormBean bform = (FormBean) form;

		if (bform.getName().equals("")) {
			error.reject("name", "name is requirded");
		}
		if (bform.getEmail().indexOf("@") == 0) {
			error.reject("email", "invalid Email");
		}

	}

}
