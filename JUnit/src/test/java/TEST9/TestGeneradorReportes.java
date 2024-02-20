package TEST9;

import org.example.Ejercicio9.GeneradorReportes; // Importa la clase GeneradorReportes desde el paquete correcto
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestGeneradorReportes {
    @TestFactory
    public List<DynamicTest> testGenerarReporte() {
        List<String> lista = Arrays.asList("prueba1", "prueba2");
        GeneradorReportes generadorReportes = new GeneradorReportes();

        return List.of(
                dynamicTest("Dinamic Test", () -> {
                    assertEquals("Reporte:\n- prueba1\n- prueba2\n", generadorReportes.generarReporte(lista));
                })
        );
    }
}
