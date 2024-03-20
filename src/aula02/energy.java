package aula02;

import java.util.Scanner;

public class energy {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite A Quantidade de Agua");
    double M = sc.nextDouble();
    System.out.println("Digite a temperatura inicial");
    double I = sc.nextDouble();
    System.out.println("Digite a temperatura final");
    double F = sc.nextDouble();
    sc.close();
    double Q = M * (F - I);
    System.err.println("A energia necessaria é: " + Q*4184);
  }
}
