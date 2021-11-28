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
        this.password = password;
    }

    @Override
    public void setEmail(String email) throws IllegalEmailFormatException {
        String patternForEmail ="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\" +
                ".[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern emailPattern = Pattern.compile(patternForEmail);

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
