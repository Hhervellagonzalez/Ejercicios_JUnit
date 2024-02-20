package TEST9;

import org.example.Ejercicio9.GeneradorReportes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneradorReportesTest {

    private final GeneradorReportes generador = new GeneradorReportes();

    // Método estático para generar datos de prueba
    static Collection<List<String>> datosPrueba() {
        return Arrays.asList(
                Arrays.asList("dato1", "dato2", "dato3"),
                Arrays.asList("a", "b", "c"),
                Arrays.asList("abc", "def", "ghi")
        );
    }

    // Prueba parametrizada que utiliza los datos generados por el método datosPrueba
    @ParameterizedTest
    @MethodSource("datosPrueba")
    public void testGenerarReporte(List<String> datos) {
        String reporteGenerado = generador.generarReporte(datos);

        // Verifica que el reporte generado contiene todas las cadenas en mayúsculas
        for (String dato : datos) {
            String datoMayusculas = dato.toUpperCase();
            assertEquals(true, reporteGenerado.contains(datoMayusculas));
        }
    }
}
