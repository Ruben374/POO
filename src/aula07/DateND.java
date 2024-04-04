package aula07;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateND extends Date {
    private int daysSince2000;

    // Construtor
    public DateND(int daysSince2000) {
        this.daysSince2000 = daysSince2000;
    }

    // Método para obter a data como uma string no formato "yyyy-MM-dd"
    @Override
    public String toString() {
        LocalDate date = LocalDate.of(2000, 1, 1).plusDays(daysSince2000);
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    // Método para obter o ano da data
    public int getYear() {
        LocalDate date = LocalDate.of(2000, 1, 1).plusDays(daysSince2000);
        return date.getYear();
    }

    // Método para obter o mês da data
    public int getMonth() {
        LocalDate date = LocalDate.of(2000, 1, 1).plusDays(daysSince2000);
        return date.getMonthValue();
    }

    // Método para obter o dia do mês da data
    public int getDayOfMonth() {
        LocalDate date = LocalDate.of(2000, 1, 1).plusDays(daysSince2000);
        return date.getDayOfMonth();
    }

    // Outros métodos públicos podem ser implementados conforme necessário
}
