package com.example.bizretailnew;





import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class Sales extends Activity {
	String type,subtype,quant1,price1,total1,fabric;
	int quantity,price,totalprice,invquant;
	DBAdapter myDb;
	long newId;
	//DBAdapterSales myDb2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sales);
		openDB();
		RadioButton radio0=(RadioButton)findViewById(R.id.radio0);
		radio0.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio1=(RadioButton)findViewById(R.id.radio1);
				RadioButton radio2=(RadioButton)findViewById(R.id.radio2);
				radio1.setChecked(false);
				radio2.setChecked(false);
			}
		});
		
		RadioButton radio1=(RadioButton)findViewById(R.id.radio1);
		radio1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio0=(RadioButton)findViewById(R.id.radio0);
				RadioButton radio2=(RadioButton)findViewById(R.id.radio2);
				radio0.setChecked(false);
				radio2.setChecked(false);
			}
		});
		
		RadioButton radio2=(RadioButton)findViewById(R.id.radio2);
		radio2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio0=(RadioButton)findViewById(R.id.radio0);
				RadioButton radio1=(RadioButton)findViewById(R.id.radio1);
				radio0.setChecked(false);
				radio1.setChecked(false);
			}
		});
		
		RadioButton radio3=(RadioButton)findViewById(R.id.radio3);
		radio3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio4=(RadioButton)findViewById(R.id.radio4);
				RadioButton radio5=(RadioButton)findViewById(R.id.radio5);
				radio4.setChecked(false);
				radio5.setChecked(false);
			}
		});
		
		RadioButton radio4=(RadioButton)findViewById(R.id.radio4);
		radio4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio3=(RadioButton)findViewById(R.id.radio3);
				RadioButton radio5=(RadioButton)findViewById(R.id.radio5);
				radio3.setChecked(false);
				radio5.setChecked(false);
			}
		});
		
		RadioButton radio5=(RadioButton)findViewById(R.id.radio5);
		radio5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				RadioButton radio3=(RadioButton)findViewById(R.id.radio3);
				RadioButton radio4=(RadioButton)findViewById(R.id.radio4);
				radio3.setChecked(false);
				radio4.setChecked(false);
			}
		});
		
		RadioButton radioButton1=(RadioButton)findViewById(R.id.radioButton1);
		radioButton1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText pri=(EditText)findViewById(R.id.editText2);
				price=200;
        		fabric="Cotton";
        		pri.setText(Integer.toString(price));
				RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
				RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);
				radioButton2.setChecked(false);
				radioButton3.setChecked(false);
			}
		});
		
		RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
		radioButton2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText pri=(EditText)findViewById(R.id.editText2);
				price=600;
        		fabric="Silk";
        		pri.setText(Integer.toString(price));
				RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);
				RadioButton radioButton1=(RadioButton)findViewById(R.id.radioButton1);
				radioButton1.setChecked(false);
				radioButton3.setChecked(false);
			}
		});
		
		RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);
		radioButton3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText pri=(EditText)findViewById(R.id.editText2);
				price=400;
        		fabric="Polyester";
        		pri.setText(Integer.toString(price));
				RadioButton radioButton1=(RadioButton)findViewById(R.id.radioButton1);
				RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
				radioButton1.setChecked(false);
				radioButton2.setChecked(false);
			}
		});
		
		Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	setContentView(R.layout.records);
            	
            	displayRecords(v);
            	
            }
            });
		 
		Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	EditText quant=(EditText)findViewById(R.id.editText1);
            	quant1=quant.getText().toString();
            	quantity=Integer.valueOf(quant1);
            	
            	EditText pri=(EditText)findViewById(R.id.editText2);
            	price1=pri.getText().toString();
            	price=Integer.valueOf(price1);
            	
            	EditText tot=(EditText)findViewById(R.id.editText3);
            	totalprice=quantity*price;
            	total1=String.valueOf(totalprice);
            	tot.setText(total1);
            	
            }
            });   	  
            
           
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	RadioButton radio0=(RadioButton)findViewById(R.id.radio0);
            	RadioButton radio1=(RadioButton)findViewById(R.id.radio1);
            	RadioButton radio2=(RadioButton)findViewById(R.id.radio2);
            	RadioButton radio3=(RadioButton)findViewById(R.id.radio3);
            	RadioButton radio4=(RadioButton)findViewById(R.id.radio4);
            	RadioButton radio5=(RadioButton)findViewById(R.id.radio5);
            	RadioButton radioButton1=(RadioButton)findViewById(R.id.radioButton1);
            	RadioButton radioButton2=(RadioButton)findViewById(R.id.radioButton2);
            	RadioButton radioButton3=(RadioButton)findViewById(R.id.radioButton3);
            	EditText quant=(EditText)findViewById(R.id.editText1);
            	
            	
            	
            	if(radio0.isChecked())
            	{
            		type="Men";
            	}
            	if(radio2.isChecked())
            	{
            		type="Women";
            	}
            	if(radio1.isChecked())
            	{
            		type="Kids";
            	}
            	if(radio3.isChecked())
            	{
            		subtype="Casuals";
            	}
            	if(radio4.isChecked())
            	{
            		subtype="Formals";
            	}
            	if(radio5.isChecked())
            	{
            		subtype="Ethnic";
            	}
            	if(radioButton1.isChecked())
            	{
            		price=200;
            		fabric="Cotton";
            	}
            	if(radioButton2.isChecked())
            	{
            		price=600;
            		fabric="Silk";
            	}
            	if(radioButton3.isChecked())
            	{
            		price=400;
            		fabric="Polyester";
            	}
            	quant1=quant.getText().toString();
            	quantity=Integer.valueOf(quant1);
            	totalprice=quantity*price;
            	total1=String.valueOf(totalprice);
            	invquant=myDb.sumAll1(type, subtype,fabric);
            	TextView errormsg=(TextView)findViewById(R.id.textView8);
            	if(quantity>invquant)
            		errormsg.setText("Requested stock not available");
            	else
            	{
            		errormsg.setText("");
            		newId=myDb.insertRow3(type,subtype,fabric,quantity,price,totalprice);
            		myDb.insertRow1(type,subtype,fabric,-quantity,-(price/2),-(totalprice/2));
            		Button button3 = (Button) findViewById(R.id.button3);
                    button3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                        	Cursor cursor=myDb.getRow3(newId);
                        	displayRecordSet(cursor);
                        	
                        }
                        });  
            	}
            		
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	TextView textView8=(TextView)findViewById(R.id.textView8);
            	textView8.setText("You haven't saved yet");
            	
            }
            });
          
	} 
	public void displayRecords(View v) {
		Cursor cursor=myDb.getAllRows3();
		displayRecordSetAll(cursor);
		}
	private void displayRecordSet(Cursor cursor) {
		// TODO Auto-generated method stub
		String message="";
		
		if(cursor.moveToFirst())
						{
			do
			
		{
			int id=cursor.getInt(0);
			String type=cursor.getString(1);
			String subtype=cursor.getString(2);
			String fabric=cursor.getString(3);
			int quantity=cursor.getInt(4);
			int price=cursor.getInt(5);
			int totalprice=cursor.getInt(6);
			message+="id="+id
					+",type="+type
					+",subtype="+subtype
					+",fabric="+fabric
					+",quantity="+quantity
					+",price="+price
					+",totalprice="+totalprice
					+"\n";
		}while(cursor.moveToNext());
		}
		cursor.close();
		TextView t1=(TextView)findViewById(R.id.textView8);
		t1.setText(message);
	}
	
	private void displayRecordSetAll(Cursor cursor) {
		// TODO Auto-generated method stub
		String message="";
		
		if(cursor.moveToFirst())
						{
			do
			
		{
			int id=cursor.getInt(0);
			String type=cursor.getString(1);
			String subtype=cursor.getString(2);
			String fabric=cursor.getString(3);
			int quantity=cursor.getInt(4);
			int price=cursor.getInt(5);
			int totalprice=cursor.getInt(6);
			if(type.equals("Women"))
			{
				if(subtype.equals("Ethnic"))
				{
					if(fabric.equals("Silk"))
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t"+subtype
								+"\t\t\t\t\t"+fabric
								+"\t\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
					else
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t"+subtype
								+"\t\t\t\t\t"+fabric
								+"\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
						
				}
				else
				{
					if(fabric.equals("Silk"))
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t"+subtype
								+"\t\t\t\t"+fabric
								+"\t\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
					else
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t"+subtype
								+"\t\t\t\t"+fabric
								+"\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
				}
					
				}
			else
			{
				if(subtype.equals("Ethnic"))
				{
					if(fabric.equals("Silk"))
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t\t"+subtype
								+"\t\t\t\t\t"+fabric
								+"\t\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
					else
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t\t"+subtype
								+"\t\t\t\t\t"+fabric
								+"\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
						
				}
				else
				{
					if(fabric.equals("Silk"))
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t\t"+subtype
								+"\t\t\t\t"+fabric
								+"\t\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
					else
					{
						message+="\t"+id
								+"\t\t"+type
								+"\t\t\t\t"+subtype
								+"\t\t\t\t"+fabric
								+"\t\t\t"+quantity
								+"\t\t\t\t"+price
								+"\t\t\t\t"+totalprice
								+"\n";
					}
				}
			
			}
				
		}while(cursor.moveToNext());
		}
		cursor.close();
		TextView t2=(TextView)findViewById(R.id.textView2);
		t2.setText(message);
	}
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		closeDB();
	}
	private void closeDB() {
		// TODO Auto-generated method stub
		myDb.close();
		//myDb2.close();
	}

	private void openDB() {
		// TODO Auto-generated method stub
		myDb=new DBAdapter(this);
		myDb.open();
		//myDb2=new DBAdapterSales(this);
		//myDb2.open();
		}	
}
       
