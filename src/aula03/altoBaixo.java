package aula03;

import java.util.Random;
import java.util.Scanner;

public class altoBaixo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char end = 'N';
    do {
      int tentativas = 0;

      Random random = new Random();
      int number = random.nextInt(4);
      number++;
      int n;

      do {
        System.err.println("Digite um número");
        n = sc.nextInt();
        tentativas++;
        if (n > number) {
          System.err.println("O numero é menor, tentativas: " + tentativas);
        } else if (n < number) {
          System.err.println(" o numero é maior, tentativas: " + tentativas);
        } else {
          System.err.println("Acertou o numero, tentativas: " + tentativas);
        }
      } while (n != number);
      System.err.println("Pretende jogar outra vez S ou N?");
      end = sc.next().charAt(0);
    } while (end == 'S');
  }
}
