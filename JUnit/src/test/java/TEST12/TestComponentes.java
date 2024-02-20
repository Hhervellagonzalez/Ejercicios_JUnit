package TEST12;

import org.example.Ejercicio12.ComponenteA;
import org.example.Ejercicio12.ComponenteB;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComponentes {

    @Test
    public void testOperacionA() {
        ComponenteA componenteA = new ComponenteA();
        assertEquals("Resultado de operación A", componenteA.operacionA());
    }

    @Test
    public void testOperacionB() {
        ComponenteB componenteB = new ComponenteB();
        assertEquals(42, componenteB.operacionB());
    }
}
