package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest
{
    final String namePattern = "^[A-Z]+[a-z]{2,}$";
    final String phonePattern = "^[0-9]{2}+(s)?+[0-9]{10}$";

    @Test
    public void givenFirstName_whenProper_returnTrue()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(namePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("True", obj.validate("Anupama"));
    }

    @Test
    public void givenFirstName_whenShort_returnFalse()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(namePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("False", obj.validate("An"));
    }

    @Test
    public void givenSecondName_whenProper_returnTrue()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(namePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("True", obj.validate("Anupama"));
    }

    @Test
    public void givenSecondName_whenShort_returnFalse()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(namePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("False", obj.validate("An"));
    }

    @Test
    public void givenPhoneNumber_whenCorrect_returnTrue()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(phonePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("True", obj.validate("918086124102"));
    }

    @Test
    public void givenPhoneNumber_whenIncorrect_returnFalse()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(phonePattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("False", obj.validate("9605132016"));
    }
}
