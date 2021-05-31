package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest
{
    @Test
    public void givenPassword_WhenCorrect_ReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("passWrdCheck123#$");
        Assert.assertTrue(status);
    }

    @Test
    public void givenPassword_WhenIncorrect_ReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("Pass");
        Assert.assertFalse(status);
    }
}
