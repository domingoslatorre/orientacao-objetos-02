package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        if ( base > 0.0 && altura > 0.0 ) {
            this.base = base;
            this.altura = altura;
        }
    }

    public Double calcularArea() {
        return base * altura;
    }

    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void setBase(Double base) throws IllegalAccessException {
        if ( base <= 0.0 )
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        this.base = base;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) throws IllegalAccessException {
        if ( altura <= 0.0 )
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

}
