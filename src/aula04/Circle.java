package aula04;

import aula04.common.Verificador;

public class Circle {
    private double raio;

    public Circle(double raio) {
        if (Verificador.isPositiv(raio))
            this.raio = raio;
        else
            System.out.println("Raio inválido");
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return Math.pow(this.raio, 2) * 3.14;
    }

    public double perimetro() {
        return 2 * this.raio * 3.14;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Circle outroCirculo = (Circle) obj;
        return Double.compare(outroCirculo.raio, raio) == 0;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.0);

        System.out.println("Círculo 1 é igual ao Círculo 2? " + circle1.equals(circle2));
        System.out.println("Círculo 1 é igual ao Círculo 3? " + circle1.equals(circle3));
    }
}
