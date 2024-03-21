package aula06;

import aula06.Pessoa;
import aula05.DateYMD;

public class Aluno extends Pessoa {
    public static int ultimo = 0;
    private DateYMD regDate;
    private int nMec;

    @Override
    public String toString() {
        return super.toString() + " Número mecanografico: " + " Data de registro: " + this.regDate.toString();
    }

    public Aluno(int cc, String name, DateYMD datanasc, DateYMD date) {
        super(name, datanasc, cc);
        regDate = date;
        nMec = ++ultimo;

    }

    public Aluno(int cc, String name, DateYMD datanasc) {
        super(name, datanasc, cc);
        nMec = ++ultimo;
        // Date x = new Date();
        regDate = new DateYMD(21, 03, 2014);

    }
    public int getnMec(){
        return this.nMec;
    }
}
