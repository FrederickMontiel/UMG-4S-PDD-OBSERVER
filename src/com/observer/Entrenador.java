/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer;

/**
 *
 * @author PC
 */
public class Entrenador implements Observador {
    private String equipo;

    public Entrenador(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public void actualizar(String evento) {
        System.out.println("Entrenador del equipo " + equipo + ": ajustando la estrategia debido al evento - " + evento);
    }
}
