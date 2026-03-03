package com.smarttask.service;
import com.smarttask.model.*;
import java.util.*;

public class GestorTareas implements Accionable {

    private List<Tarea> tareas = new ArrayList<>();
    private int contadorID = 1;

    @Override
    public void agregarTarea(String nombre, int prioridad, boolean urgente) {
        Tarea tarea;
        if(urgente) {
            tarea = new TareaUrgente(contadorID++, nombre, prioridad);
        } else {
            tarea = new TareaNormal(contadorID++, nombre, prioridad);
        }
        tareas.add(tarea);
    }

    @Override
    public void listarTareas() {
        for (Tarea t : tareas) {
            System.out.println(
                    t.getId() + " | " +
                    t.getNombre() + " | " +
                    t.tipo() + " | " +
                    (t.isCompletado() ? "Completada" : "Pendiente")
            );
        }
    }
    @Override
    public void eliminarTareas(int id) {
        tareas.removeIf(t -> t.getId() == id);
        System.out.println("Tarea " + id + " eliminada con exito");
    }

    @Override
    public void marcarComoCompletada(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.marcarComoCompletada();
            }
        }
    }
    public List<Tarea> obtenerTareas(){
        return new ArrayList<>(tareas);
    }
}
