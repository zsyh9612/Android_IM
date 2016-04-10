package com.zaizai.im;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterActivity extends Activity {

	Button buttonRegister,buttonCancel;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {  
	            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);  
	            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);  
	        }//³Á½þÊ½×´Ì¬À¸
		setContentView(R.layout.register);
		
		buttonRegister=(Button)findViewById(R.id.buttonRegister);
		buttonCancel=(Button)findViewById(R.id.buttonCancel);

			
			
		buttonRegister.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();	
			}
		});
		
		
		buttonCancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();	
			}
		});
		
		
		
	}

}
