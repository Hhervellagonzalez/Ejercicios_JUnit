package TEST6;

import org.example.Ejercicio6.CalculadoraAvanzada;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    private final CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

    @Test
    public void testRaizCuadrada() {
        assertEquals(4.0, calculadora.raizCuadrada(16));
    }

    @Test
    @Disabled("Implementación pendiente o en revisión")
    public void testLogaritmoNatural() {
        // Se deshabilita esta prueba porque la implementación del logaritmo natural está pendiente o en revisión.
        fail("Implementación pendiente o en revisión");
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculadora.factorial(5));
    }
}
