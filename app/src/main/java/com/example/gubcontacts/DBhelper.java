package com.example.gubcontacts;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper( Context context ) {
        super(context, "userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(name TEXT primary key, college TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        DB.execSQL("drop Table if exists Userdetails");
    }
    public Boolean insertUserData(String login)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", login);
        long result = DB.insert("Userdetails", null, contentValues);
        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Boolean updateUserData(String Myname, String Mycollege)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("college", Mycollege);
        Cursor cursor = DB.rawQuery("select * from Userdetails where name = ?", new String[]{Myname});
        if(cursor.getCount()>0){
            long result = DB.update("Userdetails", contentValues, "name=?", new String[] {Myname});
            if(result == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else return false;
    }

    public Boolean deleteUserData(String Logout)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from Userdetails where name = ?", new String[]{Logout});
        if(cursor.getCount()>0){
            long result = DB.delete("Userdetails", "name=?", new String[] {Logout});
            if(result == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else return false;
    }

    public Cursor getdata()
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from Userdetails", null );
        if (!(cursor.moveToFirst()) || cursor.getCount() ==0){
            return null;
        }
        return cursor;

    }
}

