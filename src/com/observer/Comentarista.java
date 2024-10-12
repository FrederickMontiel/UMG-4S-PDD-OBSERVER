/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer;

/**
 *
 * @author PC
 */
public class Comentarista implements Observador {
    private String nombre;

    public Comentarista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String evento) {
        System.out.println("Periodista " + nombre + ": reportando sobre el evento - " + evento);
    }
}
