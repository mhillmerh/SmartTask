package com.smarttask.model;

/**
 * Clase abstracta que representa una tarea genérica.
 * Contiene los atributos y comportamientos comunes para todos los tipos de tareas.
 */

public abstract class Tarea {

    private int id;
    private String nombre;
    private int prioridad;
    private boolean completado;

    /**
     * Constructor de la tarea.
     * @param id identificador único de la tarea.
     * @param nombre Nombre descriptivo de la tarea.
     * @param prioridad Nivel de prioridad asignado a la tarea.
     */

    public Tarea(int id, String nombre, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completado = false;
    }

    /**
     * Devuelve el identificador de la tarea.
     * @return id de la tarea.
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre de la tarea.
     * @return Nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la prioridad de la tarea.
     * @return prioridad de la tarea.
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Indica si la tarea está completada.
     * @return true si está completada, false en caso contrario.
     */
    public boolean isCompletado() {
        return completado;
    }

    /**
     * Marca tareda como completada
     */
    public void marcarComoCompletada() {
        this.completado = true;
    }

    /**
     * Devuelve el tipo de tarea.
     * @return ripo de la tarea.
     */
    public abstract String tipo();
}
