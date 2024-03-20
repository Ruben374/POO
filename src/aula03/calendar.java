package aula03;

import java.util.Scanner;

public class calendar {

  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.err.println("Digite a data no formato mm yyyy");
    int month = sc.nextInt();
    int year = sc.nextInt();
    System.err.println("Digite o dia da semana em que começa o mês");
    int dayWeek = sc.nextInt();
    sc.close();
    if (
      (month >= 1 && month <= 12) &&
      (year >= 0) &&
      (dayWeek >= 1 && dayWeek <= 7)
    ) {
      int days = monthDays(month, year, dayWeek);
      printCalendar(dayWeek, days, month, year);
    }
  }

  public static int monthDays(int m, int y, int d) {
    // Retorna a quantidade de dias do mes
    if (m == 4 || m == 5 || m == 6 || m == 7 || m == 11) {
      return 30;
    } else if (m == 2) {
      if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) { //verifica se o ano é bissexto
        return 29;
      } else {
        return 28;
      }
    } else {
      return 31;
    }
  }

  public static String getMonthName(int m) {
    //Retorna o nome dos mes, em função do número
    switch (m) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid Month";
    }
  }

  public static void printCalendar(
    int startDay,
    int totalDays,
    int month,
    int year
  ) {
    System.out.println("   " + getMonthName(month) + ", " + year);
    System.out.println("Su Mo Tu We Th Fr Sa");

    int currentDay = 1;

    // Imprime espaços no início para alinhar o primeiro dia
    for (int i = 1; i < startDay; i++) {
      System.out.print("   ");
    }

    // Imprime os dias do calendário
    while (currentDay <= totalDays) {
      // Imprime o dia atual e move para a próxima linha
      System.out.printf("%3d", currentDay);

      // Se for domingo, quebra para a próxima linha
      if ((startDay + currentDay - 1) % 7 == 0) {
        System.out.println();
      }

      currentDay++;
    }
  }
}
