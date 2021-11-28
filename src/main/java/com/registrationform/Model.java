package com.registrationform;

public class Model implements Contract.ModelInterface{

    private String email;
    private String password;

    public Model(){
        this.email = null;
        this.password = null;
    }

    @Override
    public Boolean setPassword(String password) {
        this.password = password;
        return true;
    }

    @Override
    public Boolean setEmail(String email) {
        this.email = email;
        return true;
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
