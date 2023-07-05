package com.example.practica_final.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "movimientos", foreignKeys = @ForeignKey(entity = Cuenta.class, parentColumns = "id", childColumns = "cuentaId", onDelete = ForeignKey.CASCADE))
public class Movimiento {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private long cuentaId;
    private String tipo;
    private double monto;
    private String motivo;
    private double latitud;
    private double longitud;
    private String urlImagen;

    public Movimiento(long cuentaId, String tipo, double monto, String motivo, double latitud, double longitud, String urlImagen) {
        this.cuentaId = cuentaId;
        this.tipo = tipo;
        this.monto = monto;
        this.motivo = motivo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.urlImagen = urlImagen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(long cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
