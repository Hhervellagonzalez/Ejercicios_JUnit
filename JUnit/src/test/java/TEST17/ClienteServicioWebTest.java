package TEST17;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.example.Ejercicio17.ClienteServicioWeb;
import org.example.Ejercicio17.ServicioWeb;
import org.junit.jupiter.api.Test;

public class ClienteServicioWebTest {

    @Test
    public void testObtenerInformacionUsuario() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        when(servicioWebMock.obtenerDatosUsuario("123")).thenReturn("Información del usuario");

        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);


        String resultado = clienteServicioWeb.obtenerInformacionUsuario("123");


        assertEquals("Información del usuario", resultado);

        verify(servicioWebMock).obtenerDatosUsuario("123");
        verifyNoMoreInteractions(servicioWebMock);
    }
}
