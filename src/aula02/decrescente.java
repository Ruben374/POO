package aula02;
import common.extra;
import java.util.Scanner;
public class decrescente {
  public static void main(String[] args) {
    int n;
    int col = 0;
    Scanner s = new Scanner(System.in);
    n = (int) extra.readPositiveNumer();
    for (int i = n; i >= 0; i--) {
      if (i % 10 == 0 && i != 0) {
        if (col == 0) {
          System.out.println(i);
        } else {
          System.out.println("," + i);
        }
        col = 0;
      } else {
        if (col == 0) {
          System.out.print(i);
        } else {
          System.out.print("," + i);
        }
        col++;
      }
    }
    s.close();
  }
}
