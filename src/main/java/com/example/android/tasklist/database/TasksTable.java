package com.example.android.tasklist.database;

public class TasksTable {
    public static final String TABLE_TASKS = "tasks";
    public static final String TABLE_LIST = "list";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_LIST_ID= "list_id";
    public static final String COLUMN_TASK_NAME = "task_name";
    public static final String COLUMN_NOTES = "notes";
    public static final String COLUMN_DATE_COMPLETED = "date_completed";
    public static final String COLUMN_HIDDEN = "hidden";
    public static final String COLUMN_ID_LIST = "_id";

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_TASKS + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_LIST_ID + " TEXT NOT NULL," +
                    COLUMN_TASK_NAME + " TEXT," +
                    COLUMN_NOTES + " TEXT," +
                    COLUMN_DATE_COMPLETED + " TEXT," +
                    COLUMN_HIDDEN + " TEXT," +
                    "FOREIGN KEY(" + COLUMN_LIST_ID + ") REFERENCES " + TABLE_LIST + "(" + COLUMN_ID_LIST + "));";

    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_TASKS;
}
