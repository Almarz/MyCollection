package com.example.myapp;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * This is the main container for the Tabs Activities
 *
 */
public class TabsActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabs);
		
		//Instantiate class TabHost
		TabHost tabHost = getTabHost();
		Resources resources = getResources();
		
		//Set Tab One
		Intent homeActivty = new Intent().setClass(TabsActivity.this, HomeActivity.class);
		TabSpec homeTabSpec = tabHost.newTabSpec("Home")
		    .setIndicator("", resources.getDrawable(R.drawable.ic_launcher)) //Set the icon of the Tab
			.setContent(homeActivty);
		
		Intent contactsActivty = new Intent().setClass(getApplicationContext(), ContactActivity.class);
		TabSpec contactsTabSpec = tabHost.newTabSpec("Contact Us")
				.setIndicator("", resources.getDrawable(R.drawable.lo))
				.setContent(contactsActivty);
		
		//Add the Tabs
		tabHost.addTab(contactsTabSpec);
		tabHost.addTab(homeTabSpec);
		
	}

}
