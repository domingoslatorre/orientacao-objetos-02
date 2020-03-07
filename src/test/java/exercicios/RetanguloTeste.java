package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach() {
        r1 = new Retangulo(2.0, 3.0);
    }

    @AfterEach
    public void afterEach() {
        r1 = null;
    }

    @Test
    public void criarObjetoRetangulo() {
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(r1.getBase());
        assertNotNull(r1.getAltura());
    }

    @Test
    public void metodoCalcularArea() {
        assertEquals(6.0, r1.calcularArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        assertEquals(10.0, r1.calcularPerimetro());
    }

    // Valor base valido 4
    @Test
    public void metodoSetBaseValorValido4() throws IllegalAccessException {
        r1.setBase(4.0);

        assertEquals(4.0, r1.getBase());
    }

    // Valor base invalido 0
    @Test
    public void metodoSetBaseValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(0.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor base invalido -4
    @Test
    public void metodoSetBaseValorInvalido4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(-4.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor da base = 2
    @Test
    public void metodoGetBase() {
        assertEquals(2.0, r1.getBase());
    }

    // Valor altura valido 4
    @Test
    public void metodoSetAlturaValorValido4() throws IllegalAccessException {
        r1.setAltura(4.0);

        assertEquals(4.0, r1.getAltura());
    }

    // Valor altura invalido 0
    @Test
    public void metodoSetAlturaValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(0.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor altura invalido -4
    @Test
    public void metodoSetAlturaValorInvalido4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-4.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor altura = 3
    @Test
    public void metodoGetAltura() {
        assertEquals(3.0, r1.getAltura());
    }
}
