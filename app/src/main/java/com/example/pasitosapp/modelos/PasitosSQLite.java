package com.example.pasitosapp.modelos;

public class PasitosSQLite {
    private double latitud, longitud;
    private int bateria;
    private long id;

    public PasitosSQLite(double latitud, double longitud, int bateria)
    {
        this.latitud = latitud;
        this.longitud = longitud;
        this.bateria = bateria;
    }

    // Constructor para cuando instanciamos desde la BD
    public PasitosSQLite(double latitud, double longitud, int bateria, long id)
    {
        this.latitud = latitud;
        this.longitud = longitud;
        this.bateria = bateria;
        this.id = id;
    }

    public double getLatitud(){return latitud;}

    public void setLatitud(double latitud){this.latitud = latitud;}

    public double getLongitud(){return longitud;}

    public void setLongitud(double longitud){this.longitud = longitud;}

    public int getBateria(){return bateria;}

    public void setBateria(int bateria){this.bateria = bateria;}

    public long getId(){return id;}

    public void setId(long id){this.id = id;}
}
