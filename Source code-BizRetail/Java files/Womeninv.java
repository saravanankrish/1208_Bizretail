package com.example.bizretailnew;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Womeninv extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.womeninv);
		Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              Intent intent = new Intent(Womeninv.this,womenfor.class);
              startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              Intent intent = new Intent(Womeninv.this,womencas.class);
              startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              Intent intent = new Intent(Womeninv.this,womeneth.class);
              startActivity(intent);
            }
        });
			
	}
}
       

