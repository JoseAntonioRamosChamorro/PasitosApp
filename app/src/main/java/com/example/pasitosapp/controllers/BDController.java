package com.example.pasitosapp.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.pasitosapp.BaseDatos;
import com.example.pasitosapp.modelos.PasitosSQLite;

import java.util.ArrayList;

public class BDController
{
    private BaseDatos baseDatos;
    private String NOMBRE_TABLA = "SQLiteDatos";

    // Constructor de la Clase BaseDatos
    public BDController(Context context)
    {
        baseDatos = new BaseDatos(context);
    }

    // Insertar datos en la BD
    public long insertarDatos(PasitosSQLite datos)
    {
        SQLiteDatabase sqLiteDatabase = baseDatos.getWritableDatabase();
        ContentValues datosAInsertar = new ContentValues();
        datosAInsertar.put("latitud", datos.getLatitud());
        datosAInsertar.put("longitud", datos.getLongitud());
        datosAInsertar.put("bateria", datos.getBateria());
        return sqLiteDatabase.insert(NOMBRE_TABLA, null, datosAInsertar);
    }
}