package com.zaizai.im;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegisterActivity extends Activity {

	Button buttonRegister,buttonCancel;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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
