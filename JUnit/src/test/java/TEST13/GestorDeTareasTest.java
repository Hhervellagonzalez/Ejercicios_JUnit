package TEST13;

import org.example.Ejercicio13.GestorDeTareas; // Cambia Ejercicio4 a Ejercicio13
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    @Test
    public void testAgregarTarea() {
        GestorDeTareas gestor = new GestorDeTareas();
        gestor.agregarTarea("1", "Estudiar");
        assertEquals("Estudiar", gestor.buscarTareaPorId("1").orElse(null));
    }

    @Test
    public void testEliminarTareaExistente() {
        GestorDeTareas gestor = new GestorDeTareas();
        gestor.agregarTarea("1", "Estudiar");
        assertTrue(gestor.eliminarTarea("1"));
    }

    @Test
    public void testBuscarTareaExistente() {
        GestorDeTareas gestor = new GestorDeTareas();
        gestor.agregarTarea("1", "Estudiar");
        assertTrue(gestor.buscarTareaPorId("1").isPresent());
    }

}
