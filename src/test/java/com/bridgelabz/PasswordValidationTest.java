package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidationTest {
    final String passwordpattern = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[@#$%^&-+=!]){1}[a-zA-Z0-9@#$%^&-+=!]{8,}$";

    @Test
    public void givenPassword_WhenCorrect_ReturnsTrue() {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(passwordpattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("False", obj.validate("anupama1"));
    }

    @Test
    public void givenPassword_WhenIncorrect_ReturnsFalse()
    {
        UserRegistrationPasswordValidator obj = (String input) -> {
            Pattern pattern = Pattern.compile(passwordpattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "True";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("False", obj.validate("anupama1"));
    }
}
