package TEST5;

import org.example.Ejercicio5.GestorDeConexion;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeConexionTest {

    @BeforeAll
    public static void setUp() {
        GestorDeConexion.abrirConexion();
    }

    @AfterAll
    public static void tearDown() {
        GestorDeConexion.cerrarConexion();
    }

    @Test
    public void testOperacion1() {
        // Realizar operación 1 en la base de datos
        System.out.println("Realizando operación 1 en la base de datos...");
        assertTrue(true); // Asegúrate de que la operación 1 se realiza correctamente
    }

    @Test
    public void testOperacion2() {
        // Realizar operación 2 en la base de datos
        System.out.println("Realizando operación 2 en la base de datos...");
        assertTrue(true); // Asegúrate de que la operación 2 se realiza correctamente
    }

    // Más pruebas...

}
