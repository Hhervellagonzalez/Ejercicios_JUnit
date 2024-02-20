package TEST16;

import org.example.Ejercicio16.GeneradorNumeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {

    @Test
    public void testEsPar_NumeroPar() {
        GeneradorNumeros generador = new GeneradorNumeros();
        int numeroPar = 2;
        assertTrue(generador.esPar(numeroPar));
    }

    @Test
    public void testEsPar_NumeroImpar() {
        GeneradorNumeros generador = new GeneradorNumeros();
        int numeroImpar = 3;
        assertFalse(generador.esPar(numeroImpar));
    }
    @Test
    public void testGenerarNumeroAleatorioEnRango_RangoCorrecto() {
        GeneradorNumeros generador = new GeneradorNumeros();
        int min = 1;
        int max = 10;
        int numeroGenerado = generador.generarNumeroAleatorioEnRango(min, max);
        assertTrue(numeroGenerado >= min && numeroGenerado <= max);
    }
}
