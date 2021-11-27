package com.registrationform;

public interface Contract {
    interface ModelInterface{
        public void setPassword();
        public void setEmail();
        public String getEmail();
        // checks email and password before setting them, True if in acceptable format
        public Boolean checkPassword();
        public Boolean checkEmail();
    }

    interface MainActivityPresenterInterface{
        public void updatePassword();
        public void updateEmail();
    }

    interface MainActivityInterface{
        public void onDestroy();
        public void onEmailEntered();
        public void onPasswordEntered();
    }
}
