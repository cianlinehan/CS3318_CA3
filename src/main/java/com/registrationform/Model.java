package com.registrationform;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Model implements Contract.ModelInterface{

    private String email;
    private String password;

    public Model(){
        this.email = null;
        this.password = null;
    }

    @Override
    public void setPassword(String password) throws IllegalPasswordFormatException {
        Pattern hasLetterPattern = Pattern.compile("[a-zA-Z]{1,}");
        Pattern hasDigitPattern = Pattern.compile("[0-9]{1,}");
        Pattern atLeast7CharsPattern = Pattern.compile("[a-zA-Z0-9]{7,}");
        Pattern hasSpecialCharacterPattern = Pattern.compile("[^a-z0-9 ]{1,}", Pattern.CASE_INSENSITIVE);

        if(!hasLetterPattern.matcher(password).matches() | !hasDigitPattern.matcher(password).matches() |
                !atLeast7CharsPattern.matcher(password).matches() | !hasSpecialCharacterPattern.matcher(password).matches()){
            throw new IllegalPasswordFormatException("Incorrect password format");
        }
        else{
            this.password = password;
        }
    }

    @Override
    public void setEmail(String email) throws IllegalEmailFormatException {
        Pattern emailPattern = Pattern.compile("^([a-zA-Z0-9_\\-.]+)@((\\[[0-9]{1,3}\\" +
                ".[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(]?)$");

        if (!emailPattern.matcher(email).matches()){
            throw new IllegalEmailFormatException("Malformed email format");
        }
        else{
            this.email = email;
        }
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

}
