package common;

import java.util.Scanner;

public class extra {

  public static double readPositiveNumer() {
    double number;
    Scanner sc = new Scanner(System.in);
    do {
      number = sc.nextDouble();
      sc.close();
      if (number < 0) {
        System.out.println("Somente numeros positivos meu amigo!");
      }
    } while (number < 0);
    return number;
  }

  public static int readIntAndPositiveNumber() {
    int number = 0;
    Scanner sc = new Scanner(System.in);
    boolean validInput = false;

    do {
      try {
        System.out.println("Digite um número inteiro positivo:");
        number = sc.nextInt();
        if (number < 0) {
          System.out.println(
            "Somente números inteiros positivos são permitidos!"
          );
        } else {
          validInput = true;
        }
      } catch (Exception e) {
        System.out.println(
          "Entrada inválida. Por favor, digite um número inteiro."
        );
      }
    } while (!validInput);

    return number;
  }

  public static boolean isPrim(int number) {
    int div = 0;
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) div++;
    }
    if (div == 2) return true; else return false;
  }

  public static double readPositiveNumber1000() {
    double number;
    Scanner sc = new Scanner(System.in);
    do {
      number = sc.nextDouble();
      sc.close();
      if (number < 0 || number % 1000 != 0) System.out.println(
        "Somente numeros positivos e multiplos de 1000"
      );
    } while (number < 0);

    return number;
  }
}
