package aula04;
import aula04.Circle;
import aula04.Retangle;
import aula04.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] figuras = new Object[10]; // Inicialize com um tamanho fixo

        int countFiguras = 0; // Contador de figuras adicionadas

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Retângulo");
            System.out.println("2. Criar Triângulo");
            System.out.println("3. Criar Círculo");
            System.out.println("4. Listar Figuras");
            System.out.println("5. Comparar Pares de Figuras (equals)");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o comprimento do retângulo:");
                    double comprimento = scanner.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double altura = scanner.nextDouble();
                    figuras[countFiguras++] = new Retangle(comprimento, altura);
                    System.out.println("Retângulo criado!");
                    break;

                case 2:
                    System.out.println("Digite o lado 1 do triângulo:");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Digite o lado 2 do triângulo:");
                    double lado2 = scanner.nextDouble();
                    System.out.println("Digite o lado 3 do triângulo:");
                    double lado3 = scanner.nextDouble();
                    figuras[countFiguras++] = new Triangle(lado1, lado2, lado3);
                    System.out.println("Triângulo criado!");
                    break;

                case 3:
                    System.out.println("Digite o raio do círculo:");
                    double raio = scanner.nextDouble();
                    figuras[countFiguras++] = new Circle(raio);
                    System.out.println("Círculo criado!");
                    break;

                case 4:
                    System.out.println("Lista de Figuras:");
                    for (int i = 0; i < countFiguras; i++) {
                        System.out.println(figuras[i].toString());
                    }
                    break;

                case 5:
                    System.out.println("Comparar Pares de Figuras:");
                    for (int i = 0; i < countFiguras; i++) {
                        for (int j = i + 1; j < countFiguras; j++) {
                            System.out.println("Figura " + i + " com Figura " + j + ": "
                                    + figuras[i].equals(figuras[j]));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
