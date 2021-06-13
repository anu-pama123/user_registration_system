package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(Parameterized.class)

public class EmailValidationTest {
    private String email;
    private boolean status;

    public EmailValidationTest(String email, boolean status) {
        this.email = email;
        this.status = status;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]
                { {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true}, {"abc.100@yahoo.com",true},
                {"abc111@yahoo.com",true}, {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true}, {"abc@1.com",true}, {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true}
                });
    }

    @Test
    public void givenPassword_WhenIncorrect_ReturnsFalse() {
        UserRegistrationPasswordValidator obj = (String input) -> {
            final String emailPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
            Pattern pattern = Pattern.compile(emailPattern);
            Matcher matcher = pattern.matcher(input);
            String r;
            if (matcher.find()) {
                r = "true";
            } else {
                r = "False";
            } ;
            return r;
        };
        Assert.assertEquals("true",obj.validate(email));
    }
}
