package aula02;

import java.util.Scanner;

public class vel {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a v1 e o d1");
    double v1 = sc.nextDouble();
    double d1 = sc.nextDouble();
    System.out.println("Digite a v2 e o d2");
    double v2 = sc.nextDouble();
    double d2 = sc.nextDouble();
    if (v1 < 0 || d1 < 0 || v2 < 0 || d2 < 0) {
      System.out.println("Não pode usar valores negativos");
    } else {
      double media;
      double t1 = d1 / v1;
      double t2 = d2 / v2;
      double t = t1 + t2;
      double d = d1 + d2;
      media = d / t;
      System.out.println("A velocidade media é: " + media);
    }
    sc.close();
  }
}
