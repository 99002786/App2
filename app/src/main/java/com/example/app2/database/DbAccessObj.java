package com.example.app2.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DbAccessObj {
    SQLiteDatabase database;
    DbHelper dbHelper;
    public DbAccessObj(Context context) {
        dbHelper = new DbHelper(context);
    }

    public void openDb(){
        database = dbHelper.getWritableDatabase();
    }
    private void closeDb(){}

    public void createRow(String title, String subtitle){
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE,title);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_SUBTITLE,subtitle);
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME,null,values);

    }
    public String readRow(){
        //query my db/table
        //database.rawQuery("select * from notes_table",null);
        Cursor cursor = database.query(FeedReaderContract.FeedEntry.TABLE_NAME,null,null,null,null,null,null);
        //return the result as a string
        cursor.moveToLast();
        int titleIndex = cursor.getColumnIndexOrThrow(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE);
        int subtitleIndex = cursor.getColumnIndexOrThrow(FeedReaderContract.FeedEntry.COLUMN_NAME_SUBTITLE);

        String title = cursor.getString(titleIndex);
        String subtitle = cursor.getString(subtitleIndex);
        return title +"\n" +subtitle;
    }
    private void updateRow(){}
    private void deleteRow(){}

}
