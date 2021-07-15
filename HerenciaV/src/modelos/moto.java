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
public class moto extends vehiculo {
    
    private int clindrada;

    public moto() {
    }

    public moto(int clindrada, String marca, String modelo, int numRuedas, int velocidadMaxima) {
        super(marca, modelo, numRuedas, velocidadMaxima);
        this.clindrada = clindrada;
    }

    public int getClindrada() {
        return clindrada;
    }

    public void setClindrada(int clindrada) {
        this.clindrada = clindrada;
    }

    @Override
    public String toString() {
        return "moto{" + "clindrada=" + clindrada + '}';
    }
    
    
}
