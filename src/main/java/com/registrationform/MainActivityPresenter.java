package com.registrationform;

//import javax.swing.text.View;

public class MainActivityPresenter implements Contract.MainActivityPresenterInterface {
    private final Model model;

    public MainActivityPresenter(){
        this.model = new Model();
    }

    @Override
    public Boolean updatePassword(String password) {
        return model.setPassword(password);
    }

    @Override
    public Boolean updateEmail(String email) {
        return model.setEmail(email);
    }

}
