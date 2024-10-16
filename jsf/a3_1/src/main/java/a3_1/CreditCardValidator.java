package a3_1;



import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("creditCardValidator")
public class CreditCardValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String creditCard = value.toString();

        
        if (creditCard.length() != 16 || !creditCard.matches("\\d+")) {
            FacesMessage msg = new FacesMessage("Credit card number is invalid. Please enter a valid 16-digit number.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

       
    }
}
