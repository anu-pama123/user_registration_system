package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    private final String FIRST_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    private final String SECOND_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    private String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
    private String PHONE_PATTERN = "^[0-9]{2}+(s)?+[0-9]{10}$";
    private String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[@#$%^&-+=!]){1}[a-zA-Z0-9@#$%^&-+=!]{8,}$";
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.find();
    }
    public boolean validateSecondName(String secondName)
    {
        Pattern pattern = Pattern.compile(SECOND_NAME_PATTERN);
        Matcher matcher = pattern.matcher(secondName);
        return matcher.find();
    }
    public boolean validateEmailId(String emailId)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.find();
    }
    public boolean validatePhoneNumber(String phoneNumber)
    {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }
    public boolean validatePassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
