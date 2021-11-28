package com.registrationform;

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
        this.email = email;
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
