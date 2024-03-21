package aula06;

import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private float montante;
    private Professor orientador;

    public Bolseiro(String name, DateYMD datanasc, int cc, Professor orientador, float montante) {
        super(cc, name, datanasc);
        this.montante = montante;
        this.orientador = orientador;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public Professor getOrientador() {
        return this.orientador;
    }

    public float getMontante() {
        return this.montante;
    }

}