package galeria;

public class Escultura extends Obra {
    private String material;
    private int quantidade;

    public Escultura(String material, int quantidade, String nome, String autor, double preco) {
        super(nome, autor, preco);
        this.material = material;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return super.toString() + " Escultura: " + material + " quantidade: " + quantidade;
    }
}
