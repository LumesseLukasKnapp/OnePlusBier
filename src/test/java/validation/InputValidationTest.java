package validation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidationTest {

    private final InputValidation inputValidation = new InputValidation();


    @Test
    public void validateText() {
        // GIVEN
        String toPass = "Haasd as Üöopa ß";

        // WHEN
        boolean expected = inputValidation.validateText(toPass);

        // THEN
        Assert.assertTrue(expected);

    }

    @Test
    public void validateText_toBeFalse() {
        // GIVEN
        String toFail = "Haasd as Üöopa 12";

        // WHEN
        boolean expected = inputValidation.validateText(toFail);

        // THEN
        assertFalse(expected);
    }

    @Test
    public void validateEmail() {
        // GIVEN
        String email = "niklein@gmail.com";

        // WHEN
        boolean expected =inputValidation.validateEmail(email);

        // THEN
        Assert.assertTrue(expected);
    }

    @Test
    public void validateEmail_toBeFalse() {
        // GIVEN
        String email = "@nikleingmail.com";
        String email1 = "nikleingmail.com@";
        String email2 = "niöäüklein@gmail.com";
        String email3 = "niöäüklein@gmailcom";

        // WHEN
        boolean expected = inputValidation.validateEmail(email);
        boolean expected1 = inputValidation.validateEmail(email1);
        boolean expected2 = inputValidation.validateEmail(email2);
        boolean expected3 = inputValidation.validateEmail(email3);

        // THEN
        assertFalse(expected);
        assertFalse(expected1);
        assertFalse(expected2);
        assertFalse(expected3);
    }

    @Test
    public void validateIBAN() {
        // GIVEN
        String iban = "DE19123412341234123412";
        String iban2 = "DE19 1234 1234 1234 1234 12";
        // WHEN
        boolean expected = inputValidation.validateIBAN(iban);
        boolean expected2 = inputValidation.validateIBAN(iban2);

        // THEN
        assertTrue(expected);
        assertTrue(expected2);
    }

    @Test
    public void validateIBAN_toBeFalse() {
        // GIVEN
        String iban = "DE19123412341233412";
        String iban2 = "DE19 1234 1234ADS 34 1234 12";
        // WHEN
        boolean expected = inputValidation.validateIBAN(iban);
        boolean expected2 = inputValidation.validateIBAN(iban2);

        // THEN
        assertFalse(expected);
        assertFalse(expected2);
    }

    @Test
    public void validateBIC() {
        // GIVEN
        String bic = "DUSSDEDDXXX";
        String bic2 = "DUSSDEDDXUS";
        // WHEN
        boolean expected = inputValidation.validateBIC(bic);
        boolean expected2 = inputValidation.validateBIC(bic2);

        // THEN
        assertTrue(expected);
        assertTrue(expected2);
    }

    @Test
    public void validateBIC_ToBeFalse() {
        // GIVEN
        String bic = "DUSSDEDDXX";
        String bic2 = "DUSSDEDDXaUS";
        // WHEN
        boolean expected = inputValidation.validateBIC(bic);
        boolean expected2 = inputValidation.validateBIC(bic2);

        // THEN
        assertFalse(expected);
        assertFalse(expected2);
    }

}