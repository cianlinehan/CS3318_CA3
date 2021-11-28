package com.registrationform;

//import javax.swing.text.View;

public class MainActivityPresenter implements Contract.MainActivityPresenterInterface {
    private Model model;

    public MainActivityPresenter(){
        this.model = new Model();
    }

    @Override
    public void updatePassword(String password) {
        model.setPassword();
    }

    @Override
    public void updateEmail(String email) {
        model.setEmail();
    }

}
