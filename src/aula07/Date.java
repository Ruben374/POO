package aula07;

abstract class Date {

    public boolean validMonth(int month) {
        return (month) >= 0 && (month) <= 12;
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
}
