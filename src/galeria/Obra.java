package galeria;

public class Obra {
    private String nome;
    private String autor;
    private double preco;
    public static int ultimo = 32;
    private int id;
    private boolean vendido = false;

    @Override
    public String toString() {
        return "Obra: " + nome + " identificador: " + this.id + " autor: " + autor + " preco: " + preco;
    }

    public Obra(String nome, String autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.id = ++ultimo;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void Vender() {
       
     this.vendido = true;
    }
    public int getId() {
        return id;
    }
    

    public boolean isVendido() {
        return vendido;
    }

}
