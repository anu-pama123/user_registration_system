package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidationTest {

    final String passwordpattern = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[@#$%^&-+=!]){1}[a-zA-Z0-9@#$%^&-+=!]{8,}$";

    UserRegistrationValidator passwordvalidator = (String input) -> {
        Pattern pattern = Pattern.compile(passwordpattern);
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
    public void givenPassword_WhenCorrect_ReturnsTrue() {
        Assert.assertEquals("False", passwordvalidator.validate("anupama1"));
    }

    @Test
    public void givenPassword_WhenIncorrect_ReturnsFalse()
    {
        Assert.assertEquals("False", passwordvalidator.validate("anupama1"));
    }
}
