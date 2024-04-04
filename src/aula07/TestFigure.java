package aula07;

public class TestFigure {
    public static void main(String[] args) {
        Circle c = new Circle(10,"green");
        System.out.println("Perimentro: " + c.perimetro());
        System.out.println("Area: " + c.area());
    }
}
