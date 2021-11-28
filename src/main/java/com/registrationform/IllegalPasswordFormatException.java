package com.registrationform;

public class IllegalPasswordFormatException extends Exception {
    public IllegalPasswordFormatException(String message){
        super(message);
    }
}
