package com.smarttask.service;

public interface Accionable {

    void agregarTarea(String nombre, int prioridad, boolean urgente);
    void listarTareas();
    void eliminarTareas(int id);
    void marcarComoCompletada(int id);
}
