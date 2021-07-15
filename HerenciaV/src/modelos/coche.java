/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Junior de la Rocha
 */
public class coche extends vehiculo {
    
    private int traccion;

    public coche() {
    }

    public coche(int traccion, String marca, String modelo, int numRuedas, int velocidadMaxima) {
        super(marca, modelo, numRuedas, velocidadMaxima);
        this.traccion = traccion;
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "coche{" + "traccion=" + traccion + '}';
    }
    
    
    
}
