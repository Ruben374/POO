package aula02;

import java.util.Scanner;

public class dist {

  public static void main(String[] args) {
    double x1, x2, y1, y2;
    Scanner s = new Scanner(System.in);
    System.out.println("Digite as coordenadas reais do ponto1: X,Y");
    x1 = s.nextDouble();
    y1 = s.nextDouble();
    System.out.println("Digite as coordenadas reais do ponto2: X,Y");
    x2 = s.nextDouble();
    y2 = s.nextDouble();
    double d = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    d = Math.sqrt(d);
    System.out.println("A distância entre dois pontos é: " + d);
    s.close();
  }
}
