package com.registrationform;

public interface Contract {
    interface ModelInterface{
        // checks email and password before setting them, true if in acceptable format, false otherwise
        public void setPassword(String password) throws IllegalPasswordFormatException;
        public void setEmail(String email) throws IllegalEmailFormatException;
        public String getEmail();
        public String getPassword();
    }

    interface MainActivityPresenterInterface{
        public Boolean updatePassword(String password);
        public Boolean updateEmail(String email);
    }

    interface MainActivityInterface{
        public void onDestroy();
    }
}
