package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Counters extends Activity implements OnClickListener {

	// declaring variables
	EditText etnumber;
	TextView tvnumber, tvresult;
	Button btnIncre, btnDecre, btnback;
	private int value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counter);

		// initializing variables
		etnumber = (EditText) findViewById(R.id.etnumber);
		tvresult = (TextView) findViewById(R.id.tvresult);

		btnIncre = (Button) findViewById(R.id.btnIncre);
		btnIncre.setOnClickListener(this);

		btnDecre = (Button) findViewById(R.id.btnDecre);
		btnDecre.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.btnIncre:
				value = Integer.parseInt(etnumber.getText().toString());
				value++;
				tvresult.setText(String.valueOf(value));
			break;

		case R.id.btnDecre:
			value = Integer.parseInt(etnumber.getText().toString());
			value--;
			tvresult.setText(String.valueOf("Result: " + value));
			break;

		default:
			break;
		}
	}
}
