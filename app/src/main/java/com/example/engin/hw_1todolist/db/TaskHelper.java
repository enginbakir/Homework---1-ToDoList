package com.example.engin.hw_1todolist.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.engin.hw_1todolist.db.Task;

public class TaskHelper extends SQLiteOpenHelper{

    public TaskHelper(Context context){
        super(context, Task.DB_Name, null, Task.DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String createTable = "Create Table " + Task.TaskEntry.TABLE + " ( " +
                Task.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Task.TaskEntry.COl_TASK_TITLE + " TEXT NOT NULL);";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + Task.TaskEntry.TABLE);
        onCreate(db);
    }

}
