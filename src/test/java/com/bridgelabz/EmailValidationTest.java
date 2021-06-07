package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class EmailValidationTest
{
    private String email;
    private boolean status;

    public EmailValidationTest(String email, boolean status)
    {
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]
                { {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true}, {"abc.100@yahoo.com",true},
                {"abc111@yahoo.com",true}, {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true}, {"abc@1.com",true}, {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true}
                });
    }
    @Test
    public void givenEmail_ReturnsResultAsPerParameter() throws UserRegistrationException
    {
        try
        {
            UserRegistration userRegistration = new UserRegistration();
            userRegistration.validateEmailId(email);
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals("True", email);
        }
    }
}
