package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest
{
    final String namePattern = "^[A-Z]+[a-z]{2,}$";
    final String phonePattern = "^[0-9]{2}+(\\s)?+[0-9]{10}$";

    UserRegistrationValidator nameValidator = (String input) -> {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(input);
        String status;
        if (matcher.find()) {
            status = "True";
        } else {
            status = "False";
        } ;
        return status;
    };

    UserRegistrationValidator phoneValidator = (String input) -> {
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(input);
        String status;
        if (matcher.find()) {
            status = "True";
        } else {
            status = "False";
        } ;
        return status;
    };

    @Test
    public void givenFirstName_whenProper_returnTrue()
    {
        Assert.assertEquals("True", nameValidator.validate("Anupama"));
    }

    @Test
    public void givenFirstName_whenShort_returnFalse()
    {
        Assert.assertEquals("False", nameValidator.validate("An"));
    }

    @Test
    public void givenSecondName_whenProper_returnTrue()
    {
        Assert.assertEquals("True", nameValidator.validate("Anupama"));
    }

    @Test
    public void givenSecondName_whenShort_returnFalse()
    {
        Assert.assertEquals("False", nameValidator.validate("An"));
    }

    @Test
    public void givenPhoneNumber_whenCorrect_returnTrue()
    {
        Assert.assertEquals("True", phoneValidator.validate("91 8086124102"));
    }

    @Test
    public void givenPhoneNumber_whenIncorrect_returnFalse()
    {
        Assert.assertEquals("False", phoneValidator.validate("9605132016"));
    }
}
