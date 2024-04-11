package galeria;

public class Galeria {
    public Obra obras[];
    public double lucro = 0;

    Galeria(int obras) {
        this.obras = new Obra[obras];
    }

    public void inserir(Obra obra) {
        this.obras[this.obras.length - 1] = obra;
    }

    public void vender(int id, double preco) {
        for (int i = 0; i < obras.length; i++) {
            if (this.obras[i] != null ){
                if(this.obras[i].getId() == id) {
                    System.out.println("obra vendida");
                    double lucro = preco - this.obras[i].getPreco();
                    if (lucro < 0) {
                        lucro = -lucro;
                    }
                    this.lucro = this.lucro + lucro;
                    if (this.obras[i] instanceof Escultura) {
                        Escultura e = (Escultura) this.obras[i];
                        e.setQuantidade(e.getQuantidade() - 1);
                        if (e.getQuantidade() == 0) {
                            this.obras[i].Vender();
                        }
                        this.obras[i] = e;
                    } else {
                        this.obras[i].Vender();
                    }
                }
            }
        }

    }

    public double getLucro() {
        return this.lucro;
    }

}
