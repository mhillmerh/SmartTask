import com.smarttask.app.SmartTaskApp;
import com.smarttask.service.GestorTareas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import com.smarttask.model.Tarea;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import com.smarttask.Main;

import static org.junit.jupiter.api.Assertions.*;

public class GestorTareasTest {

    @Test
    void deberiaEjecutarMainSinError() {
        Main.main(new String[]{});
    }

    @Test
    void deberiaEjecutarAppYSalir() {
        String input = "1\n" +            // agregar
                "TareaTest\n" +
                "1\n" +
                "false\n" +
                "2\n" +            // listar
                "3\n" +            // marcar completada
                "1\n" +
                "4\n" +            // eliminar
                "1\n" +
                "0\n";             // salir
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SmartTaskApp.main(new String[]{});
    }


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
    void listarTareas() {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Estudiar Programación", 1, false);
        gestor.agregarTarea("Estudiar java", 1, true);

        gestor.listarTareas();

        List<Tarea> tareas =gestor.obtenerTareas();
        assertEquals(2, tareas.size());
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
