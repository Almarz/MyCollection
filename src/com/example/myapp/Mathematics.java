package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mathematics extends Activity implements OnClickListener {
	
		//declaring variables
		int numberOne,numberTwo;
		Button btnadd,btnsub,btnback;
		EditText etNumberOne, etNumberTwo;
		String strNumberOne, strNumberTwo;
		TextView tvresult;
				
			//creating methods
		public static int addition(int numberOne,int numberTwo){
		int result=numberOne+numberTwo;
		return result;
			
		}
		
		public static double subtraction(double numberOne,double numberTwo){
			double result=numberOne-numberTwo;
			return result;
			
		}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mathematics);
		
		//intializing variables
		btnadd=(Button) findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		
		btnsub=(Button) findViewById(R.id.btnsub);
		btnsub.setOnClickListener(this);
		
		btnback=(Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		strNumberOne=etNumberOne.getText().toString();
		strNumberTwo=etNumberTwo.getText().toString();
		
      etNumberOne=(EditText)findViewById(R.id.etfnumber);
      etNumberTwo=(EditText)findViewById(R.id.etsnumber);

	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.btnadd:
			//changing integer to string
			int numOne=Integer.parseInt(etNumberOne.getText().toString());
			int numTwo=Integer.parseInt(etNumberTwo.getText().toString());
			
			//calling method
			int result=addition(numOne,numTwo);
			
			//changing string to integer
			String res=String.valueOf(result);
			tvresult.setText("The answer is:" + res);
			
			break;
			
            case  R.id.btnsub :
            	//changing integer to string
    			double numOne1=Double.parseDouble(etNumberOne.getText().toString());
    			double numTwo1=Double.parseDouble(etNumberTwo.getText().toString());
    			
    			//calling method
    			double answer=subtraction(numOne1,numTwo1);
    			
    			//changing string to integer
    			String resu=String.valueOf(answer);
    			
    			tvresult.setText("The answer is:" + resu);
    			
			break;
           
		default:
			break;
		}
	}

}
