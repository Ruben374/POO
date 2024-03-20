package aula03;

import java.util.Scanner;

public class strings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase;
    System.out.println("Digite uma frase ou palavra");
    frase = sc.nextLine();
    //System.out.println(frase);
    System.out.println("A frase em minusculas: " + frase.toLowerCase());
    System.out.println("Sem espaços no inicio e fim :" + frase.trim());
    System.out.println(
      "O ultimo Caracter da frase é : " + frase.charAt(frase.length() - 1)
    );
    if (frase.length() >= 3) {
      for (int i = 0; i < 3; i++) {
        System.out.println("O " + (i + 1) + "º caracter é " + frase.charAt(i));
      }
    }

    System.out.println(
      "Vamos substituir caracteres, degite o antigo e em seguida o novo caractere"
    );
    char old = sc.next().charAt(0);
    char nw = sc.next().charAt(0);
    System.out.println(frase.replace(old, nw));
    System.out.println(
      "Vamos descobrir se um caracter existe na string, degite um caractere"
    );
    char c = sc.next().charAt(0);
    if (frase.indexOf(c) != -1) {
      System.out.println("O caractere '" + c + "' existe na string.");
    } else {
      System.out.println("O caractere '" + c + "' não existe na string.");
    }
    sc.close();
  }
}
