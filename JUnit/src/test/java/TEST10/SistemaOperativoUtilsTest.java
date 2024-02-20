package TEST10;

import org.example.Ejercicio10.SistemaOperativoUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaOperativoUtilsTest {

    @EnabledOnOs(OS.WINDOWS)
    @Test
    public void testEsWindows() {
        assertTrue(SistemaOperativoUtils.esWindows());
    }
}
