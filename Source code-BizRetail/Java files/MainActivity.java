package com.example.bizretailnew;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {
	DBAdapter myDb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,mainmenu.class);
              startActivity(intent);
            }
        });
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
