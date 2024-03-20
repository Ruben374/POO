package aula04.common;

public class Verificador {

    // Método para verificar se o raio é um valor positivo
    public static boolean isPositiv(double num) {
        return num > 0;
    }

    // Método para verificar a desigualdade triangular
    public static boolean verificaDesigualdadeTriangular(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public static boolean verificaLadosPositivos(double lado1, double lado2, double lado3) {
        return (lado1 > 0) && (lado2 > 0) && (lado3 > 0);
    }

}
