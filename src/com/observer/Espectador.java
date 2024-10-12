/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer;

/**
 *
 * @author PC
 */
public class Espectador implements Observador {
    private String equipoFavorito;

    public Espectador(String equipoFavorito) {
        this.equipoFavorito = equipoFavorito;
    }

    @Override
    public void actualizar(String evento) {
        System.out.println("Fanático del equipo " + equipoFavorito + ": ¡Emocionado por el evento! - " + evento);
    }
}
