package com.registrationform;

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
        String passwordRegex = "^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[*^&@!])(?=\\\\S+$){7,}";
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        if(!passwordPattern.matcher(password).matches()){
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

        if (!emailPattern.matcher(email).find()){
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

    public static void main(String[] args) {
        Model m = new Model();
        try {
            m.setPassword("Cianlinehan2020!");
        } catch (IllegalPasswordFormatException e) {
            e.printStackTrace();
        }
    }
}
