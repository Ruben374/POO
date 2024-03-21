package aula06;

import aula05.DateYMD;

public class Professor extends Pessoa {
    private String category;
    private String department;

    public Professor(String category, DateYMD datanasc, String name, int cc, String department) {
        super(name, datanasc, cc);
        this.category = category;
        this.department = department;
    }

    /*
     * public boolean validCategorie() {
     * 
     * }
     */
}
