package TEST18;

import org.example.Ejercicio18.ProcesadorTareasPesadas;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasPesadasTest {

    @Test
    public void testRealizarOperacionIntensiva() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            long resultado = procesador.realizarOperacionIntensiva();
            assertTrue(resultado >= 0, "El resultado debe ser un número no negativo");
        });
    }
}
