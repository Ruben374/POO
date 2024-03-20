package aula03;

import java.util.Scanner;

public class notasTurma {

  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite o número de alunos da turma");
    int alunos = sc.nextInt();
    double notas[][] = new double[alunos][2];
    double pauta[] = new double[alunos];
    for (int i = 0; i < alunos; ++i) {
      for (int j = 0; j < 2; ++j) {
        notas[i][j] = Math.round(Math.random() * 20);
      }
    }
    /*   for (int i = 0; i < alunos; ++i) {
      System.out.println(
        "Digite as notas teorica e pratica do " + (i + 1) + "º aluno"
      );
      for (int j = 0; j < 2; ++j) {
        notas[i][j] = sc.nextDouble();
      }
    } */
    for (int i = 0; i < alunos; ++i) {
      pauta[i] = nota(notas[i][0], notas[i][1]);
    }

    System.out.println("NotaT NotaP Pauta");
    for (int i = 0; i < alunos; ++i) {
      for (int j = 0; j < 2; ++j) {
        System.out.print(notas[i][j] + "  ");
      }
      System.out.print(pauta[i]);
      System.out.println();
    }
  }

  public static double nota(double n1, double n2) {
    if (n1 < 7 || n2 < 7) {
      return 66;
    } else {
      return 0.4 * n1 + 0.6 * n2;
    }
  }
}
