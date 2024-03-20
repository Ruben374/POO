package aula04;

import aula04.common.Verificador;

public class Retangle {
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
        return Double.compare(outroRetangulo.comprimento, comprimento) == 0 &&
                Double.compare(outroRetangulo.altura, altura) == 0;
    }

    @Override
    public String toString() {
        return "Retangulo com comprimento: " + comprimento + " e altura " + altura;
    }

    public Retangle(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
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

    public double area() {
        return this.altura * this.comprimento;
    }

    public double perimetro() {
        return 2 * (comprimento + altura);
    }

    /*
     * public static void main(String[] args) {
     * 
     * }
     */
}
