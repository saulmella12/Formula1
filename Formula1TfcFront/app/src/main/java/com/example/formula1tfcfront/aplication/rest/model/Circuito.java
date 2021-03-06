package com.example.formula1tfcfront.aplication.rest.model;

public class Circuito {
    private int id;
    private String pais;
    private String vueltaRapida;
    private String nombreCircuito;
    private String longitud;
    private String imagen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }

    public String getVueltaRapida() {
        return vueltaRapida;
    }

    public void setVueltaRapida(String vueltaRapida) {
        this.vueltaRapida = vueltaRapida;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Circuito{" +
                "pais='" + pais + '\'' +
                ", nombreCircuito='" + nombreCircuito + '\'' +
                ", vueltaRapida='" + vueltaRapida + '\'' +
                ", longitud='" + longitud + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
