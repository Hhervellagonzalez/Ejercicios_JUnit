package org.example.Ejercicio3;

/**
 * Excepción personalizada para indicar que un texto no cumple con los criterios de validación.
 */
public class TextoInvalidoException extends Exception {
    public TextoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
