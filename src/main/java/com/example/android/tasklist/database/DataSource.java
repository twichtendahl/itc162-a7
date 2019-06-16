package com.example.android.tasklist.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.tasklist.model.DataList;

public class DataSource {

    private Context mContext;
    private SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;

    public DataSource(Context context) {
        this.mContext = context;
        mDbHelper = new DBHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open() { mDatabase = mDbHelper.getWritableDatabase(); }

    public void close() { mDbHelper.close(); }

    public DataList createList(DataList list) {
        ContentValues values = list.toValues();
        mDatabase.insert(ListTable.TABLE_LIST, null, values);
        return list;
    }
}
