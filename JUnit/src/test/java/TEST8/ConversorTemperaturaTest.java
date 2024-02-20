package TEST8;

import org.example.Ejercicio8.ConversorTemperatura;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {
    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @ValueSource(doubles = 0)
    public void testCelsius(double celsius) {
        assertEquals(32.0, conversor.celsiusAFahrenheit(celsius));
    }

    @ParameterizedTest
    @ValueSource(doubles = 32)
    public void testFahrenheit(double fahrenheit) {
        assertEquals(0.0, conversor.fahrenheitACelsius(fahrenheit));
    }
}
