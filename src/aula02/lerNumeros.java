package aula02;

import java.util.Scanner;

public class lerNumeros {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double primeiro = 0, maior = 0, menor = 0, n, total = 0, soma = 0;
    boolean end = false;
    while (end == false) {
      System.out.println("Digite um numero");
      n = sc.nextDouble();
      soma += n;
      total++;
      if (total == 1) {
        primeiro = n;
        maior = primeiro;
        menor = primeiro;
      }
      if (n > maior) maior = n;
      if (n < menor) menor = n;
      if (total != 1) {
        if (n == primeiro) {
          end = true;
        }
      }
    }
    System.out.println(
      "o maior numero é " +
      maior +
      " o menor numero é: " +
      menor +
      " A media é: " +
      soma /
      total +
      " E foram lidos " +
      total +
      " numeros"
    );
  }
}
