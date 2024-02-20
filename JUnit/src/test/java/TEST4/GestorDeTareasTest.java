package TEST4;

import org.example.Ejercicio4.GestorDeTareas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    private GestorDeTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
        gestor.agregarTarea("Tarea 3");
    }

    @AfterEach
    public void tearDown() {
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTarea() {
        assertEquals(3, gestor.obtenerTareas().size());
        gestor.agregarTarea("Tarea 4");
        assertEquals(4, gestor.obtenerTareas().size());
    }

    @Test
    public void testEliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 2"));
        assertFalse(gestor.eliminarTarea("Tarea 5"));
        assertEquals(2, gestor.obtenerTareas().size());
    }

    @Test
    public void testLimpiarTareas() {
        assertEquals(3, gestor.obtenerTareas().size());
        gestor.limpiarTareas();
        assertEquals(0, gestor.obtenerTareas().size());
    }
}
