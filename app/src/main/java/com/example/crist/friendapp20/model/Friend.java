package com.example.crist.friendapp20.model;

import com.example.crist.friendapp20.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crist on 06/02/2018.
 */

public class Friend {

    public static List<Friend> arrayAmigos = new ArrayList<>();

    static {
        arrayAmigos.add(new Friend("Rachel Green", "algo", R.drawable.rachel,1));
        arrayAmigos.add(new Friend("Ross Geller", "algo", R.drawable.ross,1));
        arrayAmigos.add(new Friend("Monica Geller", "algo", R.drawable.monica,1));
        arrayAmigos.add(new Friend("Chandler Bing", "algo", R.drawable.chandler,1));
        arrayAmigos.add(new Friend("Phoebe Buffay", "algo", R.drawable.phoebe,1));
        arrayAmigos.add(new Friend("Joey Tribbiani", "algo", R.drawable.joey,1));
    }

    private String nombre;
    private String descripcion;
    private int foto;
    private int rate;



    public Friend(String nombre, String descripcion, int foto, int rate) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.rate = rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
