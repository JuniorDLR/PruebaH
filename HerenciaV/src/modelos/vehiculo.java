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
public class vehiculo {
    
    private String marca;
    private String modelo;
    private int numRuedas;
   private int velocidadMaxima;

    public vehiculo() {
    }

    public vehiculo(String marca, String modelo, int numRuedas, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", numRuedas=" + numRuedas + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
    
    
}
