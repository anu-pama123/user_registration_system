package com.bridgelabz;

public class UserRegistrationException extends Exception
{
    public enum ExceptionType
    {
        ENTERED_NULL,ENTERED_INVALID
    }
    ExceptionType type;
    public ExceptionType getType()
    {
        return type;
    }
    public UserRegistrationException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
