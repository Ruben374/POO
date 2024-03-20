package aula03;

import java.util.Scanner;

public class strings2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = scanner.nextLine();

    System.out.println("Número de caracteres numéricos: " + countDigits(frase));
    System.out.println("Número de espaços: " + countSpaces(frase));
    System.out.println(
      "Contém apenas minúsculas? " + containsOnlyLowerCase(frase)
    );
    System.out.println(
      "String com espaços duplicados removidos: " + removeDuplicateSpaces(frase)
    );
    System.out.println("É um palíndromo? " + isPalindrome(frase));

    scanner.close();
  }

  public static int countDigits(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        count++;
      }
    }
    return count;
  }

  public static int countSpaces(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
      if (Character.isSpaceChar(c)) {
        count++;
      }
    }
    return count;
  }

  public static boolean containsOnlyLowerCase(String s) {
    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        return false;
      }
    }
    return true;
  }

  public static String removeDuplicateSpaces(String s) {
    return s.replaceAll("\\s+", " ");
  }

  public static boolean isPalindrome(String s) {
    String cleanString = s.replaceAll("\\s+", "").toLowerCase();
    int length = cleanString.length();
    for (int i = 0; i < length / 2; i++) {
      if (cleanString.charAt(i) != cleanString.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
