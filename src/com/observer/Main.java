/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.observer;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un partido
        Partido partido = new Partido();

        // Crear algunos observadores
        Observador comentarista1 = new Comentarista("Carlos");
        Observador comentarista2 = new Comentarista("María");
        Observador fanatico = new Espectador("Real Madrid");
        Observador entrenador = new Entrenador("Barcelona");

        // Agregar observadores al partido
        partido.agregarObservador(comentarista1);
        partido.agregarObservador(comentarista2);
        partido.agregarObservador(fanatico);
        partido.agregarObservador(entrenador);

        // Registrar algunos eventos en el partido
        partido.registrarEvento("¡Gol del Real Madrid!");
        partido.registrarEvento("Tarjeta roja para el Barcelona");
    }
    
}
