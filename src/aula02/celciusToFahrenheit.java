package aula02;

import java.util.Scanner;

public class celciusToFahrenheit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor em calcius");
    double temp = sc.nextDouble();
    sc.close();
    temp = (1.8 * temp) + 32;
    System.out.println("A temperatura em Fahrenheit é: "+temp);
  }
}
