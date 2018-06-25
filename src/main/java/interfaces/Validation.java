package interfaces;

public interface Validation {

    public boolean validateText();
    public boolean validateInt();
    public boolean validateLong();
    public boolean validateZIP();
    public boolean validateStartDateBeforeEndDate();
    public boolean validateEmail();
    public boolean validateIBAN();
    public boolean validateBIC();
    public boolean validateWorktime();
}
