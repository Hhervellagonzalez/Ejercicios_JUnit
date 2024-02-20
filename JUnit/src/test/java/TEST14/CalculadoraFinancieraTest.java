package TEST14;

import org.example.Ejercicio14.CalculadoraFinanciera;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFinancieraTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testCalcularInteresCompuesto() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double principal = 1500.0;
        double tasaInteres = 0.06;
        int numeroCompuestos = 4;
        int años = 8;
        double resultadoEsperado = 1500 * Math.pow(1 + (0.06 / 4), 4 * 8);
        assertEquals(resultadoEsperado, calculadora.calcularInteresCompuesto(principal, tasaInteres, numeroCompuestos, años), DELTA);
    }

    @Test
    public void testCalcularVPN() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double tasaDescuento = 0.08;
        double[] flujosCaja = {-2000.0, 400.0, 400.0, 400.0, 400.0};
        double vpnEsperado = -2000 + 400 / (1 + 0.08) + 400 / Math.pow(1 + 0.08, 2) + 400 / Math.pow(1 + 0.08, 3) + 400 / Math.pow(1 + 0.08, 4);
        assertEquals(vpnEsperado, calculadora.calcularVPN(tasaDescuento, flujosCaja), DELTA);
    }
}
