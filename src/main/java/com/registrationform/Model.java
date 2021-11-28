package com.registrationform;

public class Model implements Contract.ModelInterface{

    private String email;
    private String password;

    public Model(){
        this.email = "";
        this.password = "";
    }

    @Override
    public Boolean setPassword() {
        return null;
    }

    @Override
    public Boolean setEmail() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
