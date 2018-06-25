package validation;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class InputValidationTest {

    private final InputValidation inputValidation = new InputValidation();

    /**
     * Unit Test für Text Validation
     */
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

    /**
     * Unit Test für PLZ Validation
     */
    @Test
    public void validateZip() {
        // GIVEN
        String toPass = "40882";

        // WHEN
        boolean expected = inputValidation.validateZIP(toPass);

        // THEN
        Assert.assertTrue(expected);

    }

    @Test
    public void validateZip_toBeFalse() {
        // GIVEN
        String toFail = "12345t";

        // WHEN
        boolean expected = inputValidation.validateZIP(toFail);

        // THEN
        Assert.assertFalse(expected);

    }

    /**
     * Unit Test für Datums Validation
     */

    @Test
    public void validateStartDateBeforeEndDate() {
        // GIVEN
        Date dt1 = new Date();
        Date dt2 = new Date(dt1.getTime() + (1000 * 60 * 60 * 24));

        // WHEN
        boolean expected = inputValidation.validateStartDateBeforeEndDate(dt1,dt2);

        // THEN
        Assert.assertTrue(expected);

    }

    @Test
    public void validateStartDateBeforeEndDate_toBeFalse() {
        // GIVEN
        Date dt1 = new Date();
        Date dt2 = new Date(dt1.getTime() + (1000 * 60 * 60 * 24));

        // WHEN
        boolean expected = inputValidation.validateStartDateBeforeEndDate(dt2,dt1);

        // THEN
        Assert.assertFalse(expected);

    }
}