package com.example.pasitosapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BaseDatos extends SQLiteOpenHelper
{
    private static final int BD_VERSION = 1;
    private static final String NOMBREBD = "pasitosBD";
    private static final String NOMBRETABLA = "SQLiteDatos";

    public BaseDatos(Context context)
    {
        super(context, NOMBREBD, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + " latitud TEXT, longitud TEXT, bateria TEXT)", NOMBRETABLA));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(String.format("DROP TABLE IF EXIST %s", NOMBRETABLA));
        onCreate(db);
    }
}
