package com.registrationform;

public interface Contract {
    interface ModelInterface{
        // checks email and password before setting them, true if in acceptable format, false otherwise
        public Boolean setPassword(String password);
        public Boolean setEmail(String email);
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
