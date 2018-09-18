package it.raffo.mybatis.ex1.view.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator {

	/**
	 * Verifica che la password e la conferma della password coincidano.
	 * 
	 * @param component
	 *            deve contenere la password inserita nella form
	 * @param value
	 *            la conferma della password
	 */
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		UIInput uiInputPassword = (UIInput) component.getAttributes().get("password");
		if (uiInputPassword == null)
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Inserire una password", null));
		Object p = uiInputPassword.getValue();
		if (p == null)
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Inserire una password", null));
		String password = p.toString();

		if (value == null)
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, null, null));
		String confermaPassword = (String) value;

		if (!confermaPassword.equals(password))
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Le password non coincidono", null));
	}
}
