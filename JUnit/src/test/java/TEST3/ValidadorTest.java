package TEST3;

import org.example.Ejercicio3.TextoInvalidoException;
import org.example.Ejercicio3.Validador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    private final Validador validador = new Validador();

    @Test
    public void testValidarTextoValido() {
        assertDoesNotThrow(() -> validador.validarTexto("Me llamo Hugo"));
    }

    @Test
    public void testValidarTextoNulo() {
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(null));
        assertEquals("El texto no puede ser nulo", exception.getMessage());
    }

    @Test
    public void testValidarTextoVacio() {
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(""));
        assertEquals("El texto no puede ser vacío", exception.getMessage());
    }
}
