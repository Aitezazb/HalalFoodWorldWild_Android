package com.example.a.halalfoodworldwide;

public class _User {

    private static String Email;
    private static String Password;

    public String getEamil() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private static final _User ourInstance = new _User();

    public static _User getInstance() {
        return ourInstance;
    }

    private _User() {
        Email = null;
        Password = null;
    }

    public Boolean IsEmpty(){
        return Email == null && Password == null ? true : false;
    }
}
