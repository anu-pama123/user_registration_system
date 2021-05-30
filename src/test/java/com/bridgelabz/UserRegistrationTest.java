package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest
{
    @Test
    public void givenFirstName_whenProper_returnTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Anupama");
        Assertions.assertEquals(status, true);
    }

}
