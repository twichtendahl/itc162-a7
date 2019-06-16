package com.example.android.tasklist.database;

public class ListTable {

    public static final String TABLE_LIST = "list";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "list_name";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_LIST + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_NAME + "TEXT);";

    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_LIST;
}
