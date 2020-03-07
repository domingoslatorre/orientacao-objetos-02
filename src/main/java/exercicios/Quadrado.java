package exercicios;

public class Quadrado {
    private Double lado;

    public Quadrado(Double lado) {
        if ( lado > 0 )
            this.lado = lado;
    }

    public Double calcularArea() {
        return lado * lado;
    }

    public Double calcularPerimetro() {
        return 4 * lado;
    }

    public void setLado(Double lado) throws IllegalAccessException {
        if ( lado <= 0 )
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

}

