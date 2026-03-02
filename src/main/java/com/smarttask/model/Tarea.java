package com.smarttask.model;

public abstract class Tarea {

    private int id;
    private String nombre;
    private int prioridad;
    private boolean completado;

    public Tarea(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void marcarComoCompletada() {
        this.completado = true;
    }

    public abstract String tipo();
}
