
package com.mycompany.barberia;

import java.io.*;

public class Servicio implements Serializable {
    int id;
    double precio;
    String nombre;

    public Servicio () {
    }

    public Servicio(int id, int precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
}
