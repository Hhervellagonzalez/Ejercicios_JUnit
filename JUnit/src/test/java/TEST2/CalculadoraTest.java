package TEST2;

import org.example.Ejercicio2.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(4, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(6, 0));
    }
}
