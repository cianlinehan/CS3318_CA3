package com.registrationform;

//import javax.swing.text.View;

public class MainActivityPresenter implements Contract.MainActivityPresenterInterface {
    private final Model model;

    public MainActivityPresenter() {
        this.model = new Model();
    }

    @Override
    public Boolean updatePassword(String password) {
        // if no exception is thrown in updating password, then it is correct
        // if format is incorrect, we return true signalling to the View than another attempt must be made for password
        try {
            model.setPassword(password);
            // return true as we have succesfully set the password
            return true;
        } catch (IllegalPasswordFormatException e) {
            return false;
        }
    }

    @Override
    public Boolean updateEmail(String email) {
        // if no exception is thrown in updating email, then it is correct
        // if format is incorrect, we return true signalling to the View than another attempt must be made for email
        try {
            model.setEmail(email);
            // return true as we have succesfully set the email
            return true;
        } catch (IllegalEmailFormatException e) {
            return false;
        }
    }
}
