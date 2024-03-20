package aula03;

import common.extra;

public class somaPrimo {

  public static void main(String[] args) {
    int num = extra.readIntAndPositiveNumber();
    int soma = 0;
    for (int i = 1; i <= num; ++i) {
      if (extra.isPrim(i)) {
        soma += i;
      }
    }
    System.err.println("O valor da soma dos numeros primos é " + soma);
  }
}
