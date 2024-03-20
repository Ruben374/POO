package aula03;
import java.util.Scanner;
public class taxaJuros {

  public static void main(String[] args) {
    double taxaJuros;
    double valor;
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor");
      valor = sc.nextDouble();
      System.out.println("Digite a taxa de juros");
      taxaJuros = sc.nextDouble();
      sc.close();
    } while (valor % 1000 != 0 || (!(taxaJuros >= 0 && taxaJuros <= 5)));
    taxaJuros = taxaJuros / 100;
    System.err.println(taxaJuros);
    for (int i = 0; i < 12; ++i) {
      valor = valor + (valor * taxaJuros);
      System.err.println("O valor no final do mes " + (i + 1) + " é " + valor);
    }
  }
}
