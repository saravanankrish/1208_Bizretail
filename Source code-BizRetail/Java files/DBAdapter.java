package com.example.bizretailnew;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


// TO USE:
// Change the package (at top) to match your project.
// Search for "TODO", and make the appropriate changes.
public class DBAdapter {

	/////////////////////////////////////////////////////////////////////
	//	Constants & Data
	/////////////////////////////////////////////////////////////////////
	// For logging:
	private static final String TAG = "DBAdapter";
	
	// DB Fields
	public static final String KEY_ROWID = "_id";
	public static final int COL_ROWID = 0;
	/*
	 * CHANGE 1:
	 */
	// TODO: Setup your fields here:
	public static final String KEY_TYPE = "type";
	public static final String KEY_SUBTYPE = "subtype";
	public static final String KEY_FABRIC = "fabric";
	public static final String KEY_QUANTITY = "quantity";
	public static final String KEY_PRICE = "price";
	public static final String KEY_TOTALPRICE = "totalprice";
	
	// TODO: Setup your field numbers here (0 = KEY_ROWID, 1=...)
	public static final int COL_TYPE = 1;
	public static final int COL_SUBTYPE = 2;
	public static final int COL_FABRIC = 3;
	public static final int COL_QUANTITY = 4;
	public static final int COL_PRICE = 5;
	public static final int COL_TOTALPRICE = 6;

	
	public static final String[] ALL_KEYS = new String[] {KEY_ROWID, KEY_TYPE, KEY_SUBTYPE, KEY_FABRIC, KEY_QUANTITY, KEY_PRICE, KEY_TOTALPRICE};
	
	// DB info: it's name, and the table we are using (just one).
	public static final String DATABASE_NAME = "MyDb";
	public static final String DATABASE_TABLE1 = "inventory";
	public static final String DATABASE_TABLE2 = "purchase";
	public static final String DATABASE_TABLE3 = "sales";
	// Track DB version if a new version of your app changes the format.
	public static final int DATABASE_VERSION = 6;	
	
	private static final String DATABASE_CREATE_SQL1 = 
			"create table " + DATABASE_TABLE1 
			+ " (" + KEY_ROWID + " integer primary key autoincrement, "
			
			/*
			 * CHANGE 2:
			 */
			// TODO: Place your fields here!
			// + KEY_{...} + " {type} not null"
			//	- Key is the column name you created above.
			//	- {type} is one of: text, integer, real, blob
			//		(http://www.sqlite.org/datatype3.html)
			//  - "not null" means it is a required field (must be given a value).
			// NOTE: All must be comma separated (end of line!) Last one must have NO comma!!
			+ KEY_TYPE + " text not null, "
			+ KEY_SUBTYPE + " text not null, "
			+ KEY_FABRIC + " text not null, "
			+ KEY_QUANTITY + " integer not null, "
			+ KEY_PRICE + " integer not null, "
			+ KEY_TOTALPRICE + " integer not null"
			// Rest  of creation:
			+ ");";
	private static final String DATABASE_CREATE_SQL2 = 
			"create table " + DATABASE_TABLE2 
			+ " (" + KEY_ROWID + " integer primary key autoincrement, "
			
			/*
			 * CHANGE 2:
			 */
			// TODO: Place your fields here!
			// + KEY_{...} + " {type} not null"
			//	- Key is the column name you created above.
			//	- {type} is one of: text, integer, real, blob
			//		(http://www.sqlite.org/datatype3.html)
			//  - "not null" means it is a required field (must be given a value).
			// NOTE: All must be comma separated (end of line!) Last one must have NO comma!!
			+ KEY_TYPE + " text not null, "
			+ KEY_SUBTYPE + " text not null, "
			+ KEY_FABRIC + " text not null, "
			+ KEY_QUANTITY + " integer not null, "
			+ KEY_PRICE + " integer not null, "
			+ KEY_TOTALPRICE + " integer not null"
			// Rest  of creation:
			+ ");";
	private static final String DATABASE_CREATE_SQL3 = 
			"create table " + DATABASE_TABLE3 
			+ " (" + KEY_ROWID + " integer primary key autoincrement, "
			
			/*
			 * CHANGE 2:
			 */
			// TODO: Place your fields here!
			// + KEY_{...} + " {type} not null"
			//	- Key is the column name you created above.
			//	- {type} is one of: text, integer, real, blob
			//		(http://www.sqlite.org/datatype3.html)
			//  - "not null" means it is a required field (must be given a value).
			// NOTE: All must be comma separated (end of line!) Last one must have NO comma!!
			+ KEY_TYPE + " text not null, "
			+ KEY_SUBTYPE + " text not null, "
			+ KEY_FABRIC + " text not null, "
			+ KEY_QUANTITY + " integer not null, "
			+ KEY_PRICE + " integer not null, "
			+ KEY_TOTALPRICE + " integer not null"
			// Rest  of creation:
			+ ");";
	
	// Context of application who uses us.
	private final Context context;
	
	private DatabaseHelper myDBHelper;
	private SQLiteDatabase db;

	/////////////////////////////////////////////////////////////////////
	//	Public methods:
	/////////////////////////////////////////////////////////////////////
	
	public DBAdapter(Context ctx) {
		this.context = ctx;
		myDBHelper = new DatabaseHelper(context);
	}
	
	// Open the database connection.
	public DBAdapter open() {
		db = myDBHelper.getWritableDatabase();
		return this;
	}
	
	// Close the database connection.
	public void close() {
		myDBHelper.close();
	}
	
	// Add a new set of values to the database.
	public long insertRow1(String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		/*
		 * CHANGE 3:
		 */		
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues initialValues = new ContentValues();
		initialValues.put(KEY_TYPE, type);
		initialValues.put(KEY_SUBTYPE, subtype);
		initialValues.put(KEY_FABRIC, fabric);
		initialValues.put(KEY_QUANTITY, quantity);
		initialValues.put(KEY_PRICE, price);
		initialValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.insert(DATABASE_TABLE1, null, initialValues);
		
		
	}
	public long insertRow2(String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		/*
		 * CHANGE 3:
		 */		
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues initialValues = new ContentValues();
		initialValues.put(KEY_TYPE, type);
		initialValues.put(KEY_SUBTYPE, subtype);
		initialValues.put(KEY_FABRIC, fabric);
		initialValues.put(KEY_QUANTITY, quantity);
		initialValues.put(KEY_PRICE, price);
		initialValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.insert(DATABASE_TABLE2, null, initialValues);
		
		
	}
	public long insertRow3(String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		/*
		 * CHANGE 3:
		 */		
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues initialValues = new ContentValues();
		initialValues.put(KEY_TYPE, type);
		initialValues.put(KEY_SUBTYPE, subtype);
		initialValues.put(KEY_FABRIC, fabric);
		initialValues.put(KEY_QUANTITY, quantity);
		initialValues.put(KEY_PRICE, price);
		initialValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.insert(DATABASE_TABLE3, null, initialValues);
		
		
	}
	
	// Delete a row from the database, by rowId (primary key)
	public boolean deleteRow1(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		return db.delete(DATABASE_TABLE1, where, null) != 0;
	}
	public boolean deleteRow2(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		return db.delete(DATABASE_TABLE2, where, null) != 0;
	}
	public boolean deleteRow3(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		return db.delete(DATABASE_TABLE3, where, null) != 0;
	}
	
	public void deleteAll1() {
		Cursor c = getAllRows1();
		long rowId = c.getColumnIndexOrThrow(KEY_ROWID);
		if (c.moveToFirst()) {
			do {
				deleteRow1(c.getLong((int) rowId));				
			} while (c.moveToNext());
		}
		c.close();
	}
	public void deleteAll3() {
		Cursor c = getAllRows3();
		long rowId = c.getColumnIndexOrThrow(KEY_ROWID);
		if (c.moveToFirst()) {
			do {
				deleteRow3(c.getLong((int) rowId));				
			} while (c.moveToNext());
		}
		c.close();
	}
	public void deleteAll2() {
		Cursor c = getAllRows2();
		long rowId = c.getColumnIndexOrThrow(KEY_ROWID);
		if (c.moveToFirst()) {
			do {
				deleteRow2(c.getLong((int) rowId));				
			} while (c.moveToNext());
		}
		c.close();
	}
	
	public int sumAllPrice1(){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_TOTALPRICE+") FROM "+DATABASE_TABLE1+"", null);

	    if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());
	    return total;
		}
	public int sumAllPrice2(){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_TOTALPRICE+") FROM "+DATABASE_TABLE2+"", null);

	    if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());
	    return total;
		}
	public int sumAllPrice3(){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_TOTALPRICE+") FROM "+DATABASE_TABLE3+"", null);

	    if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());
	    return total;
		}
	
	// Return all data in the database.
	public Cursor getAllRows1() {
		String where = null;
		Cursor c = 	db.query(true, DATABASE_TABLE1, ALL_KEYS, 
							where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}
	public Cursor getAllRows2() {
		String where = null;
		Cursor c = 	db.query(true, DATABASE_TABLE2, ALL_KEYS, 
							where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}
	public Cursor getAllRows3() {
		String where = null;
		Cursor c = 	db.query(true, DATABASE_TABLE3, ALL_KEYS, 
							where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}

	// Get a specific row (by rowId)
	public Cursor getRow1(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		Cursor c = 	db.query(true, DATABASE_TABLE1, ALL_KEYS, 
						where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}
	public Cursor getRow2(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		Cursor c = 	db.query(true, DATABASE_TABLE2, ALL_KEYS, 
						where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}
	public Cursor getRow3(long rowId) {
		String where = KEY_ROWID + "=" + rowId;
		Cursor c = 	db.query(true, DATABASE_TABLE3, ALL_KEYS, 
						where, null, null, null, null, null);
		if (c != null) {
			c.moveToFirst();
		}
		return c;
	}
	
	// Change an existing row to be equal to new data.
	public boolean updateRow1(long rowId, String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		String where = KEY_ROWID + "=" + rowId;

		/*
		 * CHANGE 4:
		 */
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues newValues = new ContentValues();
		newValues.put(KEY_TYPE, type);
		newValues.put(KEY_SUBTYPE, subtype);
		newValues.put(KEY_FABRIC, fabric);
		newValues.put(KEY_QUANTITY, quantity);
		newValues.put(KEY_PRICE, price);
		newValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.update(DATABASE_TABLE1, newValues, where, null) != 0;
	}
	public boolean updateRow2(long rowId, String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		String where = KEY_ROWID + "=" + rowId;

		/*
		 * CHANGE 4:
		 */
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues newValues = new ContentValues();
		newValues.put(KEY_TYPE, type);
		newValues.put(KEY_SUBTYPE, subtype);
		newValues.put(KEY_FABRIC, fabric);
		newValues.put(KEY_QUANTITY, quantity);
		newValues.put(KEY_PRICE, price);
		newValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.update(DATABASE_TABLE2, newValues, where, null) != 0;
	}
	public boolean updateRow3(long rowId, String type, String subtype, String fabric, int quantity, int price, int totalprice) {
		String where = KEY_ROWID + "=" + rowId;

		/*
		 * CHANGE 4:
		 */
		// TODO: Update data in the row with new fields.
		// TODO: Also change the function's arguments to be what you need!
		// Create row's data:
		ContentValues newValues = new ContentValues();
		newValues.put(KEY_TYPE, type);
		newValues.put(KEY_SUBTYPE, subtype);
		newValues.put(KEY_FABRIC, fabric);
		newValues.put(KEY_QUANTITY, quantity);
		newValues.put(KEY_PRICE, price);
		newValues.put(KEY_TOTALPRICE, totalprice);
		
		// Insert it into the database.
		return db.update(DATABASE_TABLE3, newValues, where, null) != 0;
	}
	
	/*public Cursor fetchOption(long rowId) throws SQLException {

        Cursor mCursor =

                db.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,
                        KEY_TYPE, KEY_SUBTYPE, KEY_QUANTITY, KEY_PRICE, KEY_TOTALPRICE}, KEY_ROWID + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }*/
	
	/*public int sumAll(){

		 int columntotal = 0;
		 Cursor cursor1 = db.rawQuery(
		     "SELECT SUM("+KEY_QUANTITY+") FROM "+DATABASE_TABLE+" WHERE "+KEY_TYPE+"='Men'", null);
		       if(cursor1.moveToFirst()) {
		         columntotal = cursor1.getInt(0);
		     }
		   cursor1.close();

		 //String  sumtotal = Integer.toString((int)columntotal);           

		  return columntotal;

		 }*/
	public int sumAll1(String type1,String subtype1,String fabric1){
	int total = 0;
	//String men="Men";
    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_QUANTITY+") FROM "+DATABASE_TABLE1+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"' AND "+KEY_FABRIC+" = '"+fabric1+"'", null);

    if (cursor.moveToFirst()) 
    {
        total = cursor.getInt(0);
    } while (cursor.moveToNext());
    
    return total;
	}
	public int sumAll2(String type1,String subtype1,String fabric1){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_QUANTITY+") FROM "+DATABASE_TABLE2+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"' AND "+KEY_FABRIC+" = '"+fabric1+"'", null);

	    if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());
	    
	    return total;
		}
	public int sumAll3(String type1,String subtype1,String fabric1){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT SUM("+KEY_QUANTITY+") FROM "+DATABASE_TABLE3+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"' AND "+KEY_FABRIC+" = '"+fabric1+"'", null);

	    if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());
	    
	    return total;
		}
	
	public int sum1(String type1,String subtype1,int del){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT ("+KEY_QUANTITY+") FROM "+DATABASE_TABLE1+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"'", null);
	    total=cursor.getInt(0);
	    if(total<=del)
	    {
	    	deleteRow1(cursor.getPosition());
	    }
	    /*if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());*/
	    return total;
		}
	public int sum2(String type1,String subtype1,int del){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT ("+KEY_QUANTITY+") FROM "+DATABASE_TABLE2+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"'", null);
	    total=cursor.getInt(0);
	    if(total<=del)
	    {
	    	deleteRow2(cursor.getPosition());
	    }
	    /*if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());*/
	    return total;
		}
	public int sum3(String type1,String subtype1,int del){
		int total = 0;
		//String men="Men";
	    Cursor cursor = db.rawQuery("SELECT ("+KEY_QUANTITY+") FROM "+DATABASE_TABLE3+" WHERE "+KEY_TYPE+"= '"+type1+"' AND "+KEY_SUBTYPE+" = '"+subtype1+"'", null);
	    total=cursor.getInt(0);
	    if(total<=del)
	    {
	    	deleteRow3(cursor.getPosition());
	    }
	    /*if (cursor.moveToFirst()) 
	    {
	        total = cursor.getInt(0);
	    } while (cursor.moveToNext());*/
	    return total;
		}
	
	
	/////////////////////////////////////////////////////////////////////
	//	Private Helper Classes:
	/////////////////////////////////////////////////////////////////////
	
	/**
	 * Private class which handles database creation and upgrading.
	 * Used to handle low-level database access.
	 */
	private static class DatabaseHelper extends SQLiteOpenHelper
	{
		DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase _db) {
			_db.execSQL(DATABASE_CREATE_SQL1);	
			_db.execSQL(DATABASE_CREATE_SQL2);
			_db.execSQL(DATABASE_CREATE_SQL3);
		}

		@Override
		public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {
			Log.w(TAG, "Upgrading application's database from version " + oldVersion
					+ " to " + newVersion + ", which will destroy all old data!");
			
			// Destroy old database:
			_db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE1);
			_db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE2);
			_db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE3);
			// Recreate new database:
			onCreate(_db);
		}
	}
}

