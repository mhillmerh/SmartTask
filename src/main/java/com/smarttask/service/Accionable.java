package com.smarttask.service;

/**
 * Define las operaciones básicas que debe implementar un gestor de tareas.
 */
public interface Accionable {

    /**
     * Gestiona los metodos que se operan y los parametros que se deben ingresar.
     * @param nombre Nombre de la tarea.
     * @param prioridad Prioridad de esta.
     * @param urgente Urgencia de la tarea.
     */
    void agregarTarea(String nombre, int prioridad, boolean urgente);
    void listarTareas();
    void eliminarTareas(int id);
    void marcarComoCompletada(int id);
}
