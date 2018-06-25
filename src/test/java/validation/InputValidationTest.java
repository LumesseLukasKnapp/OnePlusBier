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
        Assert.assertFalse(expected);

    }
}