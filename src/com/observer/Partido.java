/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Partido {
    private List<Observador> observadores = new ArrayList<>();
    private String eventoActual;

    // Añadir un observador al partido
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Eliminar un observador del partido
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    // Notificar a todos los observadores
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(eventoActual);
        }
    }

    // Método para registrar un evento (ej. gol, tarjeta)
    public void registrarEvento(String evento) {
        this.eventoActual = evento;
        System.out.println("Evento registrado: " + evento);
        notificarObservadores();
    }
}