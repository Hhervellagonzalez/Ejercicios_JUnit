package TEST10;

import org.example.Ejercicio10.SistemaOperativoUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SistemaOperativoUtilsTest {

    @EnabledOnOs(OS.WINDOWS)
    @Test
    public void testEsWindows() {
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());
    }
    @Test
    public void testEslinux() {
        Assumptions.assumeFalse(SistemaOperativoUtils.esLinux());
    }
    @Test
    public void testEsMac() {
        Assumptions.assumeFalse(SistemaOperativoUtils.esMac());
    }
}
