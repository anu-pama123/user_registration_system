package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void givenFirstName_whenProper_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Anupama");
        Assert.assertTrue(status);
    }

    @Test
    public void givenFirstName_whenShort_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("An");
        Assert.assertFalse(status);
    }
    @Test
    public void givenSecondName_whenProper_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateSecondName("Anupama");
        Assert.assertTrue(status);
    }

    @Test
    public void givenSecondName_whenShort_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateSecondName("An");
        Assert.assertFalse(status);
    }
    @Test
    public void givenPhoneNumber_whenCorrect_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePhoneNumber("91 8086127102");
        Assert.assertFalse(status);
    }
    @Test
    public void givenPhoneNumber_whenIncorrect_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePhoneNumber("9605132016");
        Assert.assertFalse(status);
    }
}
