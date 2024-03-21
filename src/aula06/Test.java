package aula06;

import aula05.DateYMD;

public class Test {
    public static void main(String[] args) {
        Aluno al = new Aluno(9855678, "Andreia Melo", new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));

        Professor p1 = new Professor("Jorge Almeida", new DateYMD(13, 3, 1967),
                "Associado", 3467225, "Informática");

        Bolseiro bls = new Bolseiro("Igor Santos", new DateYMD(11, 5, 1985), 8976543, p1,
                900);

        bls.setMontante(1050);
        System.out.println("Aluno: " + al.getName());
        System.out.println(al);
        System.out.println("Bolseiro: " + bls.getName() + ", NMec: "
                + bls.getnMec() + ", Bolsa: " + bls.getMontante() + ", Orientador: " +
                bls.getOrientador());
        System.out.println(bls);
    }
}