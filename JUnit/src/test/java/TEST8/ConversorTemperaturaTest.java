package TEST8;

import org.example.Ejercicio8.ConversorTemperatura;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @CsvSource({
            "0, 32", // Celsius 0 a Fahrenheit
            "100, 212", // Celsius 100 a Fahrenheit
            "32, 0", // Fahrenheit 32 a Celsius
            "212, 100" // Fahrenheit 212 a Celsius
    })
    public void testConversorTemperatura(double entrada, double salidaEsperada) {
        // Verifica la conversión de Celsius a Fahrenheit
        assertEquals(salidaEsperada, conversor.celsiusAFahrenheit(entrada));

        // Verifica la conversión de Fahrenheit a Celsius
        assertEquals(salidaEsperada, conversor.fahrenheitACelsius(entrada));
    }
}
