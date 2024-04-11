package galeria;

public class ObraDigital extends Obra {
    private String Blockchain, Nft;

    public ObraDigital(String Blockchain, String Nft, String nome, String autor, double preco) {
        super(nome, autor, preco);
        this.Blockchain = Blockchain;
        this.Nft = Nft;
    }

    @Override
    public String toString() {
        return super.toString() + " Blockchain: " + Blockchain + " Nft: " + Nft;
    }
}
