package com.example.android.tasklist;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.android.tasklist.database.DBHelper;
import com.example.android.tasklist.database.DataSource;

public class MainActivity extends AppCompatActivity {

    DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDataSource = new DataSource(this);
        mDataSource.open();
        Toast.makeText(this, "Database Acquired", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mDataSource.open();
    }
}
