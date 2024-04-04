package aula07;

import aula04.common.Verificador;

public class Retangle extends Figure {
    private double comprimento, altura;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Retangle outroRetangulo = (Retangle) obj;
        return super.equals(obj) && Double.compare(outroRetangulo.comprimento, comprimento) == 0 &&
                Double.compare(outroRetangulo.altura, altura) == 0;
    }

    @Override
    public String toString() {
        return "Retangulo com comprimento: " + comprimento + " e altura " + altura;
    }

    public Retangle(double comprimento, double altura, String color) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.setColor(color);
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setAltura(double altura) {
        if (Verificador.isPositiv(altura))
            this.altura = altura;
        else
            System.out.println("Altura invalida");
    }

    public void setComprimento(double comprimento) {
        if (Verificador.isPositiv(comprimento))
            this.comprimento = comprimento;
        else
            System.out.println("Comprimento invalido");
    }

    @Override
    public double area() {
        return this.altura * this.comprimento;
    }

    @Override
    public double perimetro() {
        return 2 * (comprimento + altura);
    }

}
