package aula07;
import java.util.ArrayList;

class ObjetoMovel {
    private int x;
    private int y;
    private double distanciaPercorrida;

    public ObjetoMovel(int x, int y) {
        this.x = x;
        this.y = y;
        this.distanciaPercorrida = 0;
    }

    public void move(int newX, int newY) {
        double distancia = Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
        this.distanciaPercorrida += distancia;
        this.x = newX;
        this.y = newY;
    }

    // getters e setters
}

class Robo extends ObjetoMovel {
    private String id;
    private String tipoJogador;
    private int numGolosMarcados;

    public Robo(String id, String tipoJogador, int x, int y) {
        super(x, y);
        this.id = id;
        this.tipoJogador = tipoJogador;
        this.numGolosMarcados = 0;
    }

    public void marcarGolo() {
        this.numGolosMarcados++;
    }

    // getters e setters
}

class Bola extends ObjetoMovel {
    private String cor;

    public Bola(int x, int y, String cor) {
        super(x, y);
        this.cor = cor;
    }

    // getters e setters
}

class Equipa {
    private String nome;
    private String nomeResponsavel;
    private int totalGolosMarcados;
    private int totalGolosSofridos;
    private ArrayList<Robo> robos;

    public Equipa(String nome, String nomeResponsavel) {
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
        this.totalGolosMarcados = 0;
        this.totalGolosSofridos = 0;
        this.robos = new ArrayList<>();
    }

    public void adicionarRobo(Robo robo) {
        this.robos.add(robo);
    }

    public void marcarGolo() {
        this.totalGolosMarcados++;
    }

    public void sofrerGolo() {
        this.totalGolosSofridos++;
    }

    // getters e setters
}

class Jogo {
    private Equipa equipa1;
    private Equipa equipa2;
    private Bola bola;
    private int duracaoJogo; // em minutos
    private int tempoDecorrido; // em minutos

    public Jogo(Equipa equipa1, Equipa equipa2, Bola bola, int duracaoJogo) {
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.bola = bola;
        this.duracaoJogo = duracaoJogo;
        this.tempoDecorrido = 0;
    }

    public void simularMovimentacaoRobos() {
        // Lógica para simular movimentação dos robôs
    }

    public void simularMarcacaoGolos() {
        // Lógica para simular a marcação de gols
    }

    public void avancarTempo(int minutos) {
        tempoDecorrido += minutos;
    }

    // getters e setters
}

public class Main {
    public static void main(String[] args) {
        // Criação de objetos para teste
        Robo robo1 = new Robo("R1", "Guarda-Redes", 0, 0);
        Robo robo2 = new Robo("R2", "Avancado", 0, 0);
        Bola bola = new Bola(0, 0, "Branca");
        Equipa equipa1 = new Equipa("Equipa 1", "Responsavel 1");
        equipa1.adicionarRobo(robo1);
        equipa1.adicionarRobo(robo2);
        Equipa equipa2 = new Equipa("Equipa 2", "Responsavel 2");

        Jogo jogo = new Jogo(equipa1, equipa2, bola, 90); // 90 minutos de duração do jogo
        jogo.simularMovimentacaoRobos();
        jogo.simularMarcacaoGolos();
    }
}
