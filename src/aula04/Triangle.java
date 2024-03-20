package aula04;

import java.util.Scanner;

import aula04.common.Verificador;

public class Triangle {
    private double lado1, lado2, lado3;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Triangle outroTriangulo = (Triangle) obj;
        return Double.compare(outroTriangulo.lado1, lado1) == 0 &&
                Double.compare(outroTriangulo.lado2, lado2) == 0 &&
                Double.compare(outroTriangulo.lado3, lado3) == 0;
    }

    @Override
    public String toString() {
        return "Triangulo com os lados: " + lado1 + " " + lado2 + " " + lado3;
    }

    public Triangle(double lado1, double lado2, double lado3) {
        if (Verificador.verificaDesigualdadeTriangular(lado1, lado2, lado3)
                && Verificador.verificaLadosPositivos(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else
            System.out.println("comprimentos invalidos");

    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        if (Verificador.verificaDesigualdadeTriangular(lado1, this.lado2, this.lado3))
            this.lado1 = lado1;
        else
            System.out.println("comprimento do lado invalido");
    }

    public void setLado2(double lado2) {
        if (Verificador.verificaDesigualdadeTriangular(this.lado1, lado2, this.lado3))
            this.lado2 = lado2;
        else
            System.out.println("comprimento do lado invalido");
    }

    public void setLado3(double lado3) {
        if (Verificador.verificaDesigualdadeTriangular(this.lado1, this.lado2, lado3))
            this.lado3 = lado3;
        else
            System.out.println("comprimento do lado invalido");
    }

    public double perimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    public double area() {// calculo da area com a formula de haron
        double s = (this.lado1 + this.lado2 + this.lado3) / 2;
        s = s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3);
        return Math.sqrt(s);
    }

    public static void main(String[] args) {
        Triangle novo = new Triangle(1, 1, 3);
        Scanner sc = new Scanner(System.in);
        System.out.println(novo);
        System.out.println("digite um lado");
        int lado = sc.nextInt();
        novo.setLado1(lado);
        sc.close();

    }
}
