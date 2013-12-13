package com.example.bizretailnew;




import android.os.Bundle;
import android.app.Activity;

import android.widget.TextView;

public class Revenue extends Activity {
	//DBAdapterSales myDb3;
	DBAdapter myDb;
	//DBAdapterPurchase myDb1;
	int proinv,propur;
	double tax;
	int rev;
	double pro;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.revenue);
		openDB();
		
		TextView revenue=(TextView)findViewById(R.id.textView3);
		rev=myDb.sumAllPrice3();
		revenue.setText(Integer.toString(rev));
		TextView profit=(TextView)findViewById(R.id.textView4);
		proinv=myDb.sumAllPrice1();
		propur=myDb.sumAllPrice2();
		tax=(0.1)*rev;
		pro=rev-propur+proinv-tax;
		TextView ta=(TextView)findViewById(R.id.textView6);
		profit.setText(Double.toString(pro));
		ta.setText(Double.toString(tax));
	}

	
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		closeDB();
	}
	private void closeDB() {
		// TODO Auto-generated method stub
		myDb.close();
		//myDb1.close();
		//myDb3.close();
	}

	private void openDB() {
		// TODO Auto-generated method stub
		//myDb=new DBAdapter(this);
		//myDb.open();
		//myDb1=new DBAdapterPurchase(this);
		//myDb1.open();
		//myDb3=new DBAdapterSales(this);
		//myDb3.open();
		myDb=new DBAdapter(this);
		myDb.open();
		}	

}
