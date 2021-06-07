package com.bridgelabz;

public class UserRegistration
{
    private static final String FIRST_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    private static final String SECOND_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
    private static final String PHONE_PATTERN = "^[0-9]{2}+(s)?+[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[@#$%^&-+=!]){1}[a-zA-Z0-9@#$%^&-+=!]{8,}$";
    private String message;
    public UserRegistration()
    {

    }
    public UserRegistration(String message)
    {
        this.message = message;
    }
    public String userRegistration(String message) throws UserRegistrationException
    {
        this.message = message;
        return userRegistration("");
    }
    public static String validateFirstName(String firstName) throws UserRegistrationException
    {
        try
        {
            if(firstName.matches(FIRST_NAME_PATTERN))
            {
                return "True";
            }
            else
            {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,"Provide a valid pattern");
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Don't pass null value");
        }
    }
    public static String validateSecondName(String secondName) throws UserRegistrationException
    {
        try
        {
            if (secondName.matches(SECOND_NAME_PATTERN))
            {
                return "True";
            }
            else
            {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,"Provide a valid pattern");
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,"Don't pass null value");
        }
    }
    public static String validateEmailId(String emailId) throws UserRegistrationException
    {
        try
        {
            if (emailId.matches(EMAIL_PATTERN))
            {
                return "true";
            }
            else
            {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,"Provide a valid pattern");
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,"Don't pass null value");
        }
    }
    public void validatePhoneNumber(String phoneNumber) throws UserRegistrationException
    {
        try
        {
            if (phoneNumber.matches(PHONE_PATTERN))
            {
            }
            else
            {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,"Provide a valid pattern");
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,"Don't pass null value");
        }
    }
    public static String validatePassword(String password) throws UserRegistrationException
    {
        try
        {
            if (password.matches(PASSWORD_PATTERN))
            {
                return "True";
            }
            else
            {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID,"Provide a valid pattern");
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,"Don't pass null value");
        }
    }
    public static String moodAnalyse(String firstName, String lastName, String phoneNumber, String email, String password) throws UserRegistrationException
    {
        try
        {
            if (validateFirstName(firstName) == "True" && validateSecondName(lastName) == "True" && validatePassword(password) == "True" && validateEmailId(email) == "True")
            {
                return "Happy";
            }
            else
            {
                return "Sad";
            }
        }
        catch (NullPointerException e)
        {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL,"Don't pass null value");
        }
    }
}
