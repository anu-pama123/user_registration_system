package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    private final String FIRST_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.find();
    }
    private final String SECOND_NAME_PATTERN ="^[A-Z]+[a-z]{2,}$";
    public boolean validateSecondName(String secondName)
    {
        Pattern pattern = Pattern.compile(SECOND_NAME_PATTERN);
        Matcher matcher = pattern.matcher(secondName);
        return matcher.find();
    }
}
