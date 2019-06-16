package com.example.android.tasklist.model;

import android.content.ContentValues;

import com.example.android.tasklist.database.ListTable;

public class DataList {

    private String listId;
    private String listName;

    public DataList() {  }

    public DataList(String listId, String listName) {
        this.listId = listId;
        this.listName = listName;
    }

    public String getListId() { return listId; }

    public String getListName() { return listName; }

    public void setListId(String listId) { this.listId = listId; }

    public void setListName(String listName) { this.listName = listName; }

    public ContentValues toValues() {
        ContentValues values = new ContentValues(2);
        values.put(ListTable.COLUMN_ID, listId);
        values.put(ListTable.COLUMN_NAME, listName);
        return values;
    }

    @Override
    public String toString() {
        return "DataList{" +
                "listId='" + listId + '\'' +
                ", listName='" + listName + '\'' +
                '}';
    }
}
