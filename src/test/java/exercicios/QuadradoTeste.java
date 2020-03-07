package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTeste {
    private Quadrado q1;

    @BeforeEach
    public void beforeEach() {
        q1 = new Quadrado(2.0);
    }

    @AfterEach
    public void afterEach() {
        q1 = null;
    }

    @Test
    public void criarObjetoQuadrado() {
        assertNotNull(q1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(q1.getLado());
    }

    @Test
    public void metodoCalcularArea() {
        assertEquals(4.0, q1.calcularArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        assertEquals(8.0, q1.calcularPerimetro());
    }

    // Valor valido 4
    @Test
    public void metodoSetLadoValorValido4() throws IllegalAccessException {
        q1.setLado(4.0);

        assertEquals(4.0, q1.getLado());
    }

    // Valor invalido 0
    @Test
    public void metodoSetLadoValorInvalido0() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> q1.setLado(0.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor invalido -4
    @Test
    public void metodoSetLadoValorInvalido4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> q1.setLado(-4.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    // Valor do lado = 2
    @Test
    public void metodoGetLado() {
        assertEquals(2.0, q1.getLado());
    }

    @
}
