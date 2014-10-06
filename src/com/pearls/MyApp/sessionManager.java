package com.pearls.MyApp;

import java.util.HashMap;

import com.example.myapp.Logins;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.provider.SyncStateContract.Constants;

public class sessionManager {

	
	//declare variables
    SharedPreferences sharedpreferences;
    Editor editor;
    SharedPreferences pref;
    Context _context;
   
 public void Sessionmanager(Context context){  
	 
        this._context = context;
        
     //instance of the class
    sharedpreferences = _context.getSharedPreferences(Constants._COUNT,0);
    editor = sharedpreferences.edit();
       
 }  
 
 	// This method stores user details in shared preferences.
public void createLoginSession(String name, String email, String password, String phonenumber){
   

    editor.putString("constants.KEY_EMAIL",email);   
    editor.putString("constants.KEY_PASSWORD",password);
    editor.putString("constants.KEY_FIRST",name);
    editor.putString("constants.KEY_PHONE",phonenumber);
    
    editor.commit(); // commit changes
}

	//This creates login data
public void CreateLoginSession(String email, String password){
	
	sharedpreferences.getString(Constants._COUNT,email);
	sharedpreferences.getString(Constants._COUNT,password);


}
	//Get stored data from hash maps
public HashMap<String, String> getUserDetails(){
   HashMap<String, String> user = new HashMap<String, String>();
  
	 user.put(Constants._COUNT, null);
	 user.put(Constants._COUNT, null);
	 user.put(Constants._COUNT, null);
	 user.put(Constants._COUNT, null);
	
	    return user;
}
public void checkLogin(){
    // Check login status
	
        // if user is not logged in, direct him to Login screen
        Intent i = new Intent(_context, Logins.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        
        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        
        // Staring Login Activity
        _context.startActivity(i);
    }

//Clear session details

public void logoutUser(){
	
	   // Clear user data
	   editor.clear();
	   editor.commit();
	   
	   //direct user to the login screen
	   Intent i = new Intent(_context, Logins.class);
	   
	   // Closing all the Activities
	   i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	   
	   // Add new Flag to start new Activity
	   i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	   
	   // Staring Login Activity
	   _context.startActivity(i);
}
   
}



