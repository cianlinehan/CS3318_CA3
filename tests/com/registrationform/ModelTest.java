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
    @Test
    void setPassword() {

    }

    @ParameterizedTest
    @ValueSource(strings = {"cianlinehan", "@gmail.com", "cianlinehan@gmail", "cianlinehangmail.com", "cianlinehan@gmailcom"})
    void setEmail(String email) {
        assertThrows(IllegalEmailFormatException.class, () -> model.setEmail(email));
    }
}