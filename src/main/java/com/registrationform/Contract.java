package com.registrationform;

public interface Contract {
    interface ModelInterface{
        // checks email and password before setting them, true if in acceptable format, false otherwise
        public Boolean setPassword();
        public Boolean setEmail();
        public String getEmail();
        public String getPassword();
    }

    interface MainActivityPresenterInterface{
        public void updatePassword(String password);
        public void updateEmail(String email);
    }

    interface MainActivityInterface{
        public void onDestroy();
        public void onEmailEntered();
        public void onPasswordEntered();
    }
}
