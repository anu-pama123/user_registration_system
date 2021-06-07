package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest
{
    @Test
    public void givenPassword_WhenCorrect_ReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validatePassword("Anupama#4");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals("True",e.getType());
        }
    }

    @Test
    public void givenPassword_WhenIncorrect_ReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validatePassword("anupama");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.getType());
        }
    }
    @Test
    public void givenPassword_WhenNull_ReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            String password;
            userRegistration.validatePassword(null);
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }
}
