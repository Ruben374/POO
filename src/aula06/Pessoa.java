package aula06;

import aula05.DateYMD;

public class Pessoa {
    private String name;
    private int cc;
    private DateYMD dateNasc;

    @Override
    public String toString() {
        return "Nome: " + this.name + " Data de nascimento: " + this.dateNasc.toString();
    }

   public Pessoa(String name, DateYMD dateNasc,int cc) {

        if (!validName(name)) {
            System.out.println("Nome invalido");
        }
        this.dateNasc = dateNasc;
        this.name = name;
        this.cc=cc;
    }

    public boolean validName(String str) {
        String regex = "^[a-zA-ZÀ-ÿ']+$";
        String[] names = str.split(" ");
        for (int i = 0; i < names.length; ++i) {
            if (!names[i].matches(regex)) {
                return false;
            }
        }

        return true;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

    }

}
