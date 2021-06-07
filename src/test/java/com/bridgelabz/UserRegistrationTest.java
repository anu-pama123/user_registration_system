package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void givenFirstName_whenProper_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateFirstName("Anupama");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals("True",e.getType());
        }
    }
    @Test
    public void givenFirstName_whenShort_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateFirstName("An");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.getType());
        }
    }
    @Test
    public void givenFirstName_whenNull_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateFirstName(null);
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }
    @Test
    public void givenSecondName_whenProper_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateSecondName("Anupama");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals("True",e.getType());
        }
    }
    @Test
    public void givenSecondName_whenShort_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateSecondName("An");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.getType());
        }
    }
    @Test
    public void givenSecondName_whenNull_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateSecondName(null);
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }
    @Test
    public void givenPhoneNumber_whenCorrect_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validatePhoneNumber("919605132016");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals("True",e.getType());
        }
    }
    @Test
    public void givenPhoneNumber_whenIncorrect_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validatePhoneNumber("981245670");
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.getType());
        }
    }
    @Test
    public void givenPhoneNumber_whenNull_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            userRegistration.validateFirstName(null);
        }
        catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }
    @Test
    public void givenUserRegistration_whenShort_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            String status = userRegistration.moodAnalyse("anupama", "shinoj", "91 9605132016", "anu.anupamacv@gmail.com", "anupama1@");
            Assert.assertEquals("Happy", status);
        }
        catch (UserRegistrationException e)
        {

        }
    }
    @Test
    public void givenUserRegistration_whenNull_returnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        try
        {
            String status = userRegistration.moodAnalyse("anu", "shinoj", "9605132016", "anu.anupamacv@gmail.com", "anupama1@");
            Assert.assertEquals("Sad", status);
        }
        catch (UserRegistrationException e)
        {

        }
    }
}
