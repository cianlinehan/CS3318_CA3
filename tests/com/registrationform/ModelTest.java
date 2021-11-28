package com.registrationform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private Model model;

    @BeforeEach
    void setUp() {
        this.model =  new Model();
    }

    // these are incorrect password and email formats which Model should throw exceptions to
    @ParameterizedTest
    @ValueSource(strings = {"cian", "12345678", "cianlinehan", "cianlinehan1"})
    void setIncorrectPassword(String password) {
        assertThrows(IllegalPasswordFormatException.class, () -> model.setPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"cianlinehan", "@gmail.com", "cianlinehan@gmail", "cianlinehangmail.com", "cianlinehan@gmailcom"})
    void setIncorrectEmail(String email) {
        assertThrows(IllegalEmailFormatException.class, () -> model.setEmail(email));
    }

    // try to set password and email with correct formats which should return no exceptions/errors
    @ParameterizedTest
    @ValueSource(strings = {"Cianlinehan1!", "Linehan2020!", "12345!L"})
    void setCorrectPassword(String password) {
        try {
            model.setPassword(password);
        } catch (IllegalPasswordFormatException e) {
            e.printStackTrace();
            fail();
        }
    }
}