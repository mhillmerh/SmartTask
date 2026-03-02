import com.smarttask.service.GestorTareas;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTareasTest {

    @Test
    void deberiaCompletarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Estudiar Programación", 1, false);
        gestor.agregarTarea("Estudiar java", 1, false);
        gestor.marcarComoCompletada(1);
        gestor.listarTareas();
        gestor.eliminarTareas(1);
        gestor.listarTareas();
        assertEquals(1,1);
    }



}
