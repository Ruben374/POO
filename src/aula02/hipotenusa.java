package aula02;

import java.util.Scanner;

public class hipotenusa {

  public static void main(String[] args) {
    double A, B, C;
    Scanner s = new Scanner(System.in);
    System.out.println("Digite os catetos A e B");
    A = s.nextDouble();
    B = s.nextDouble();
    C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
    double sen = Math.sin(A / C);
    double an = Math.asin(sen);
    System.out.println("A hipotenusa é " + C);
    System.out.println("O Angulo é " + an);
    s.close();
  }
}
