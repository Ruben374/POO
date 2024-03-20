package aula02;

import java.util.Scanner;

public class invest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.err.println("Degite o montante investido e a taxa de juros");
    double montante = sc.nextDouble();
    double juros = sc.nextDouble();
    for (int i = 0; i < 3; ++i) {
      double aumento = (juros / 100) * montante;
      montante += aumento;
    }
    System.err.println("O montante no final de 3 meses é: " + montante);
    sc.close();
  }
}
