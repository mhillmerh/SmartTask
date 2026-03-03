import com.smarttask.service.GestorTareas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import com.smarttask.model.Tarea;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GestorTareasTest {

    @Test
    void deberiaAgregarTarea() {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar Programación", 1, false);
        gestor.agregarTarea("Estudiar java", 1, true);

        List<Tarea> tareas = gestor.obtenerTareas();

        assertEquals(2, tareas.size());
        assertEquals("Estudiar Programación", tareas.get(0).getNombre());
        assertEquals("Estudiar java", tareas.get(1).getNombre());

    }

    @Test
    void deberiaCompletarTarea() {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar Programación", 1, false);
        gestor.agregarTarea("Estudiar java", 1, false);

        gestor.marcarComoCompletada(1);

        List<Tarea> tareas = gestor.obtenerTareas();

        assertTrue(tareas.get(0).isCompletado());
    }

    @Test
    void deberiaElimnarTarea() {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar Programación", 1, false);
        gestor.agregarTarea("Estudiar java", 1, true);

        gestor.eliminarTareas(1);

        List<Tarea> tareas = gestor.obtenerTareas();
        assertEquals(1, tareas.size());
        assertEquals("Estudiar java", tareas.get(0).getNombre());
    }



}
