package validation;

import interfaces.Validation;

import java.util.Date;
import java.util.regex.Pattern;

public class InputValidation implements Validation {

    public boolean validateText(String text) {
        return text.matches("[a-z|A-Z| ä|ö|ü|ß|Ö|Ä|Ü]+");
    }

    public boolean validateZIP(String zip) {
        return zip.matches("[\\d]{5}");
    }

    public boolean validateStartDateBeforeEndDate(Date start, Date end) { return start.before(end);}

    public boolean validateEmail(String mail) {
        return false;
    }

    public boolean validateIBAN(String iban) {
        return false;
    }

    public boolean validateBIC(String BIC) {
        return false;
    }

    public boolean validateWorktime(Long worktimeInMin) {
        return false;
    }

}
