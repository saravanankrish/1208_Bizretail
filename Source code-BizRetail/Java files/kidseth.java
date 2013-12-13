package com.example.bizretailnew;





import android.app.Activity;

import android.os.Bundle;

import android.widget.TextView;


public class kidseth extends Activity {
	
	DBAdapter myDb;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kidseth);
		openDB();
		
		
		TextView formal1=(TextView)findViewById(R.id.textView4);
		String str1=Integer.toString(myDb.sumAll1("Kids","Ethinc","Cotton"));
		formal1.setText(str1);
		
		TextView casual1=(TextView)findViewById(R.id.textView5);
		String str2=Integer.toString(myDb.sumAll1("Kids","Ethnic","Silk"));
		casual1.setText(str2);
		
		TextView ethnic1=(TextView)findViewById(R.id.textView6);
		String str3=Integer.toString(myDb.sumAll1("Kids","Ethnic","Polyester"));
		ethnic1.setText(str3);
          
	} 
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		closeDB();
	}
	private void closeDB() {
		// TODO Auto-generated method stub
		myDb.close();
	}

	private void openDB() {
		// TODO Auto-generated method stub
		myDb=new DBAdapter(this);
		myDb.open();
		}	
}
       

