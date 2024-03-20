package aula05;

import java.util.Scanner;
import aula05.DateYMD;

public class Calendar {

    int year, initday;
    // cada linha um evento;
    int[][] eventos;

    Calendar(int year, int initDay) {
        this.year = year;
        this.initday = initDay;
        eventos = new int[12][31];
    }

    Calendar() {

    }

    public int getYear() {
        return year;
    }

    public String firstWeekdayOfYear() {
        if (this.initday == 1)
            return "Domingo";
        else if (this.initday == 2)
            return "Segunda feira";
        else if (this.initday == 3)
            return "Terça feira";
        else if (this.initday == 4)
            return "Quarta feira";
        else if (this.initday == 5)
            return "Quinta feira";
        else if (this.initday == 6)
            return "Sexta feira";
        else if (this.initday == 7)
            return "Sabado ";
        else
            return "Dia invalido";
    }

    public int firstWeekdayOfMonth(int month) {
        // Calcula o dia da semana do primeiro dia do mês
        int dayOfWeek = (1 + 26 * (month + 1) / 10 + (year - 1) + (year - 1) / 4 + 6 * (year - 1) / 100
                + (year - 1) / 400) % 7;

        // Ajusta o resultado para corresponder à representação do dia da semana (1 para
        // domingo, 2 para segunda-feira, etc.)
        if (dayOfWeek == 0) {
            dayOfWeek = 1; // Domingo é representado como 7
        }

        return dayOfWeek;
    }

    public String printMonth(int month) {
        StringBuilder calendarString = new StringBuilder();

        int startDay = firstWeekdayOfMonth(month);
        int totalDays = DateYMD.monthDays(month, this.year);

        // Adiciona os nomes dos dias da semana ao cabeçalho
        calendarString.append("Su Mo Tu We Th Fr Sa\n");

        int currentDay = 1;
        // Adiciona espaços no início para alinhar o primeiro dia
        for (int i = 1; i < startDay; i++) {
            calendarString.append("   ");
        }

        // Adiciona os dias do calendário
        while (currentDay <= totalDays) {
            // Adiciona o dia atual à string do calendário e move para a próxima linha
            if (this.eventos[month - 1][currentDay - 1] > 0) {
                calendarString.append("*").append(String.format("%3d", currentDay));
            } else {
                calendarString.append(String.format("%3d", currentDay));
            }

            // Se for domingo, quebra para a próxima linha
            if ((startDay + currentDay - 1) % 7 == 0) {
                calendarString.append("\n");
            }

            currentDay++;
        }

        return calendarString.toString();
    }

    @Override
    public String toString() {
        StringBuilder calendarString = new StringBuilder();
        for (int month = 1; month <= 12; month++) {
            calendarString.append("Month ").append(month).append(":\n");
            calendarString.append(printMonth(month)); // Adicione o resultado de printMonth(month) ao calendarString
            calendarString.append("\n\n"); // Adicione uma linha em branco entre os meses
        }
        return calendarString.toString();
    }

    public void addEvent(DateYMD date) {
        int mes = date.getMonth();
        int dia = date.getDay();
        // Exemplo
        this.eventos[mes - 1][dia - 1] += 1;
    }

    public void removeEvent(DateYMD date) {
        int mes = date.getMonth();
        int dia = date.getDay();
        // Exemplo
        this.eventos[mes - 1][dia - 1] -= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        Calendar c = new Calendar();
        DateYMD date= new DateYMD();

        while (!end) {
            System.out.println("Calendar operations");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - Adicionar evento");
            System.out.println("5 - Remover evento");
            System.out.println("0 - exit");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o ano: ");
                    int year = sc.nextInt();
                    System.out.println("Digite o qual dia da semana começa o ano");
                    int weekDay = sc.nextInt();
                    c = new Calendar(year, weekDay);
                    break;
                case 2:
                    System.out.println("Digite o mes: ");
                    int month = sc.nextInt();
                    System.out.println(c.printMonth(month));
                    break;
                case 3:
                    if (c.eventos != null) 
                        System.out.println(c);
                    break;
                case 4:
                    if (c.eventos != null){
                        System.out.println(" digite o dia e o mes do envento");
                        int day=sc.nextInt();
                        int m=sc.nextInt();
                        date=new DateYMD(day, m,c.getYear());
                        c.addEvent(date);
                    }
                   
                    break;
                case 5:
                if (c.eventos != null){
                    System.out.println(" digite o dia e o mes do envento");
                    int day=sc.nextInt();
                    int m=sc.nextInt();
                    date=new DateYMD(day, m,c.getYear());
                    c.removeEvent(date); 
                break;               }
               
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

        /*
         * DateYMD data = new DateYMD(3, 3, 2014);
         * c.addEvent(data);
         * System.out.println(c);
         */
        sc.close();
    }

}
