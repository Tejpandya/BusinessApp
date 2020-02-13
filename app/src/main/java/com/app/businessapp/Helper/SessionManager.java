package com.app.businessapp.Helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;


import java.util.HashMap;

public class SessionManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Activity _context;
    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "businessApp_pref";

    private static final String IS_LOGIN = "IsLoggedIn";
    private static final String KEY_USERID = "user_id";
    private static final String KEY_USERNAME= "user_name";


    public SessionManager(Activity context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void setUserId(String userId,String user_name,String organization_id){
        editor.putString(KEY_USERID, userId);
        editor.putString(KEY_USERNAME, user_name);
        editor.commit();
    }

    public void setLogin(boolean status){
        editor.putBoolean(IS_LOGIN, true);
        editor.commit();
    }



    public String getUserId(){
        return pref.getString(KEY_USERID, "");
    }

    public String getUserName(){
        return pref.getString(KEY_USERNAME, "");
    }


    public void logoutUser(){
        editor.clear();
        editor.commit();
/*
        Intent i = new Intent(_context, LoginActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TASK);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        _context.startActivity(i);
        _context.finishAffinity();*/
    }


    public boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }





}
