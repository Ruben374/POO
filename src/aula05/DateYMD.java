package aula05;

import java.util.Scanner;

public class DateYMD {
    private int day, month, year;

    @Override
    public String toString() {
        return this.year + " - " + this.month + " - " + this.day;
    }

    DateYMD(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Data invalida");
        }

    }

    DateYMD() {
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean validMonth(int month) {
        return (month) >= 0 && (month) <= 0;
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean valid(int day, int month, int year) {
        if (validMonth(month) && year > 0)
            return (day <= monthDays(month, year));
        else
            return false;

    }

    public static int monthDays(int month, int year) {
        // Retorna a quantidade de dias do mes
        if (month == 4 || month == 5 || month == 6 || month == 7 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (leapYear(year)) { // verifica se o ano é bissexto
                return 29;
            } else {
                return 28;
            }
        } else {
            return 31;
        }
    }

    public void incrementDate() {
        if (valid(this.day, this.month, this.year)) {
            int maxDay = monthDays(this.month, this.year);
            if (this.day < maxDay) {
                this.day++;
            } else {
                this.day = 1;
                if (this.month < 12) {
                    this.month++;
                } else {
                    this.month = 1;
                    this.year++;
                }
            }
        }

    }

    public void decrementDate() {
        if (valid(this.day, this.month, this.year)) {
            if (this.day > 1) {
                this.day--;
            } else {
                if (this.month > 1) {
                    this.month--;
                    this.day = monthDays(this.month, this.year);
                } else {
                    this.month = 12;
                    this.year--;
                    this.day = monthDays(this.month, this.year);
                }
            }
        }
    }

    public void menu() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        DateYMD date = new DateYMD();
        while (!exit) {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Degite o dia o mes e o ano");
                    int year, month, day;
                    day = sc.nextInt();
                    month = sc.nextInt();
                    year = sc.nextInt();
                    date = new DateYMD(day, month, year);
                    break;
                case 2:
                    if (date != null) {
                        System.out.println(date);
                    }
                    break;
                case 3:
                    if (date != null) {
                        date.incrementDate();
                    }
                    break;
                case 4:
                    if (date != null) {
                        date.decrementDate();
                    }
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        sc.close();

    }

}
