package com.smarttask.service;
import com.smarttask.model.*;
import java.util.*;

/**
 * Clase que gestiona las tareas.
 */
public class GestorTareas implements Accionable {

    private List<Tarea> tareas = new ArrayList<>();
    private int contadorID = 1;

    /**
     * Metodo para agregar tareas. mediante el ingreso de los parametros solicitados.
     * @param nombre Se ingresa el nombre de la tarea
     * @param prioridad Se indica su prioridad.
     * @param urgente Se indica si es urgente o no.
     */
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

    /**
     * Metodo que permite listar y mostrar por consola las tareas existentes.
     */
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

    /**
     * Metodo que permite eliminar una tarea mediante su id
     * @param id Se ingresa id para buscar la tarea, si existe la elimina, de lo contrario no hace nada.
     */
    @Override
    public void eliminarTareas(int id) {
        tareas.removeIf(t -> t.getId() == id);
        System.out.println("Tarea " + id + " eliminada con exito");
    }

    /**
     * Metodo que permite marcar una tarea como completada.
     * @param id Se busca por la id y luego se cambia a completada.
     */
    @Override
    public void marcarComoCompletada(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.marcarComoCompletada();
            }
        }
    }

    /**
     * Metodo que sirve para retornar las tareas generadas.
     * @return retorna un arra list que contiene las tareas agregadas y modificadas.
     */
    public List<Tarea> obtenerTareas(){
        return new ArrayList<>(tareas);
    }
}
