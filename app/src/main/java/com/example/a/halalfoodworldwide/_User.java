package com.example.a.halalfoodworldwide;

public class _User {
    private static String Token;

    public String getToken() {return Token;}

    public void setToken(String token){Token = token;}

    private static final _User ourInstance = new _User();

    public static _User getInstance() {
        return ourInstance;
    }

    private _User() {
        Token = null;
    }

    public Boolean IsEmpty(){
        return Token == null ? true : false;
    }
}
