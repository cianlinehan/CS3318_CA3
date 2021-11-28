package com.registrationform;

public class IllegalEmailFormatException extends Exception {
    public IllegalEmailFormatException(String message){
        super(message);
    }
}

