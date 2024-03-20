package aula04;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class CashRegister {

    Product[] produtos;
    int count;

    public CashRegister() {
        produtos = new Product[5];
        count = 0;
    }

    public CashRegister(int size) {
        produtos = new Product[size];
        count = 0;
    }

    public void addProduct(Product produto) {
        if (count < produtos.length) {
            produtos[count] = produto;
            count++;
        } else {
            System.out.println("Limite máximo de produtos atingido.");
        }
        // System.out.println(this.produtos[0].getName());
    }

    @Override
    public String toString() {
        double total = 0;
        // System.out.println("Product\tPrice\tQuantity\tTotal");

        System.out.printf("%-10s   %-8s   %-8s   %-8s%n", "Product", "Price", "Quantity", "Total");
        for (int i = 0; i < count; ++i) {
            double productTotal = produtos[i].getTotalValue();
            /////////// -------Bloco de impressão--------------/////////////
            System.out.printf("%-10s   %-8.2f   %-8d   %.2f   %n", produtos[i].getName(),
                    produtos[i].getPrice(),
                    produtos[i].getQuantity(),
                    productTotal);
            ///////////////////////////////////////////////
            total += productTotal;
        }

        return "Total Value: " + total;
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));

        // TODO: Listar o conteúdo e valor total
        System.out.println(cr);

    }
}
// O erro "Cannot make a static reference to the non-static field produtos"
// ocorre porque o método addProduct é declarado como estático (static),
// enquanto o campo produtos não é estático. Em Java, métodos estáticos não
// podem acessar diretamente membros não estáticos de uma classe.

// Para corrigir isso, você pode tornar o método addProduct não estático e
// ajustar a lógica para adicionar produtos ao array. Aqui está uma correção
// sugerida: