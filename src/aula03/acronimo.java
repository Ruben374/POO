package aula03;

import java.util.Scanner;

public class acronimo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase;
    System.out.println("Digite uma frase ou palavra");
    frase = sc.nextLine();
    System.out.println(acronimar(frase));
    sc.close();
  }

  public static String acronimar(String f) {
    StringBuilder res = new StringBuilder();
    String[] palavras = f.split("\\s+");
    for (int i = 0; i < palavras.length; ++i) {
      if (palavras[i].length() >= 3) {
        res.append(Character.toUpperCase(palavras[i].charAt(0)));
      }
    }

    return res.toString();
  }
}
