package com.bridgelabz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

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
                {"abc+100@gmail.com",true}, {"abc",false}, {"abc@.com.my",false},
                {"abc123@gmail.com.a",false}, {"abc12@.com.com",false}, {"abc123@.com",false},
                {".abc@abc.com",false}, {"abc()*@gmail.com",false}, {"abc@%*.com",false},
                {"abc..2002@gmail.com",false}, {"abc.@gmail.com",false}, {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false}, {"abc@gmail.com.aa.au",false}
                });
    }
    @Test
    public void givenEmail_ReturnsResultAsPerParameter()
    {
        UserRegistration userRegistration = new UserRegistration();
        assertEquals(status,userRegistration.validateEmailId(email));
    }
}
