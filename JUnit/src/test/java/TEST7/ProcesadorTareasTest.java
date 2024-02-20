package TEST7;

import org.example.Ejercicio7.ProcesadorTareas;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasTest {

    private final ProcesadorTareas procesador = new ProcesadorTareas();

    @Test
    public void testEjecutarTareaLarga() throws InterruptedException {
        assertTimeout(Duration.ofMillis(1000), () -> {
            procesador.ejecutarTareaLarga(1010); // Simulamos una tarea que debe tardar más de 1000 ms
        });
    }
}
