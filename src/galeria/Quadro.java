package galeria;

public class Quadro extends Obra {
    private String tinta;
    private String emoldurada;
    private String tamanho;

    public Quadro(String tinta, String emoldurada, String tamanho, String nome, String autor, double preco) {
        super(nome, autor, preco);
        this.tinta = tinta;
        this.emoldurada = emoldurada;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo de tinta: " + tinta + " emoldurada: " + emoldurada + " tamanho de tela: " + tamanho;
    }

}
