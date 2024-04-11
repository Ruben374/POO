package galeria;

import java.util.Scanner;

public class MainGaleria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria(100);
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar uma obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Vender uma obra");
            System.out.println("4. Calcular o lucro total");
            System.out.println("5. Sair");
            System.out.print("Opçao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n1. Adicionar uma obra do tipo");
                    System.out.println("1. Quadro");
                    System.out.println("2. Escultura");
                    System.out.println("3. Obra Digital (NFT)");
                    System.out.print("Tipo de produto: ");
                    int opcaoProduto = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoProduto) {
                        case 1:
                            // Adicionar um Quadro
                            System.out.println("degite o nome do quadro: ");
                            String nome = sc.nextLine();
                            System.out.println("degite o nome do autor: ");
                            String autor = sc.nextLine();
                            System.out.println("degite o preço do quadro: ");
                            String preco = sc.nextLine();
                            System.out.println("degite o tipo de tinta: ");
                            String tipoTinta = sc.nextLine();
                            System.out.println("emoldurada:sim/não ");
                            String emoldurada = sc.nextLine();
                            System.out.println("digite o tamanho da tela: ");
                            String tamanhoTela = sc.nextLine();

                            Quadro quadro = new Quadro(tipoTinta, emoldurada, tamanhoTela, nome, autor,
                                    Double.valueOf(preco).doubleValue());
                            galeria.inserir(quadro);
                            break;
                        case 2:
                            // Adicionar uma Escultura
                            System.out.println("degite o nome da escultura: ");
                            String n = sc.nextLine();
                            System.out.println("degite o nome do autor: ");
                            String a = sc.nextLine();
                            System.out.println("degite o preço da escultura: ");
                            String p = sc.nextLine();
                            System.out.println("degite o tipo de material: ");
                            String material = sc.nextLine();
                            System.out.println("quantidade: ");
                            String h = sc.nextLine();
                            int quantidade = Integer.valueOf(h).intValue();
                            Escultura escultura = new Escultura(material, quantidade, n, a,
                                    Double.valueOf(p).doubleValue());
                            galeria.inserir(escultura);
                            break;
                        case 3:
                            // Adicionar uma ObraDigital (i.e., NFT)
                            System.out.println("degite o nome do nft: ");
                            String no = sc.nextLine();
                            System.out.println("degite o autor do nft : ");
                            String au = sc.nextLine();
                            System.out.println("degite o preço do nft : ");
                            String pe = sc.nextLine();
                            System.out.println("Nome da blockchein: ");
                            String block = sc.nextLine();
                            System.out.println("Edereço do contrato: ");
                            String endereco = sc.nextLine();
                            ObraDigital obradigital = new ObraDigital(block, endereco, no, au,
                                    Double.valueOf(pe).doubleValue());
                            galeria.inserir(obradigital);
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < 100; i++) {
                        if (galeria.obras[i] != null && !(galeria.obras[i].isVendido())) {
                            System.out.println(galeria.obras[i]);
                        }
                    }
                    break;
                case 3:
                    // Adicionar uma ObraDigital (i.e., NFT)
                    System.out.println("digite o id da obra: ");
                    int i = sc.nextInt();
                    System.out.println("digite o preço: ");
                    double v = sc.nextDouble();
                    galeria.vender(i, v);
                    break;
                case 4:
                    System.out.println("lucro total: " + galeria.getLucro());
                    break;
                case 5:
                    System.out.println("5. Sair");
                    sc.close();
                    break;
            }
        } while (opcao != 5);
    }
}