package com.example.engin.hw_1todolist.db;

import android.provider.BaseColumns;

public class Task {
    public static final String DB_Name = "com.example.engin.hw_1todolist.db";
    public static final int DB_Version = 1;

    public class TaskEntry implements BaseColumns{
        public static final String TABLE = "tasks";
        public static final String COl_TASK_TITLE = "title";

    }
}
