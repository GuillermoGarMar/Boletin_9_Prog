/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author ggarciamartinez
 */
public class Traballadores {
    private String nombre;
    private int soldo;
    private int cont;
    private int cont2;
    public Traballadores() {
    }

    public Traballadores(String nombre, int soldo) {
        this.nombre = nombre;
        this.soldo = soldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSoldo() {
        return soldo;
    }

    public void setSoldo(int soldo) {
        this.soldo = soldo;
    }
    public void Contador1(){
        cont++;
    }
    
}
