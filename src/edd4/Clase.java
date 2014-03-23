/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edd4;

import java.util.ArrayList;

/**
 *
 * @author David Discua
 */
public class Clase {//inicio clase

    private String nombre;
    private String codigo;
    private int unidades;
    private ArrayList<Clase> Requisitos;

    public Clase() {//inicio constructor vacio
    }//fi cosntructor Vacio

    public Clase(String nombre, String codigo, int unidades, ArrayList<Clase> Requisitos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidades = unidades;
        this.Requisitos = Requisitos;
    }//fin constructor sobrecargado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Clase> getRequisitos() {
        return Requisitos;
    }

    public void setRequisitos(ArrayList<Clase> Requisitos) {
        this.Requisitos = Requisitos;
    }
}//fin clase
