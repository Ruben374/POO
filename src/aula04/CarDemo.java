package aula04;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }

    public static boolean verificarVeiculo(String marca, String modelo, int ano, int quilometragem) {
        // Verificar a marca (uma única palavra)
        if (!marca.matches("\\b\\w+\\b")) {
            return false;
        }

        // Verificar o modelo (uma ou mais palavras)
        if (!modelo.matches("\\b\\w+(\\s\\w+)*\\b")) {
            return false;
        }

        // Verificar o ano (um número inteiro positivo com 4 algarismos)
        if (ano < 1000 || ano > 9999) {
            return false;
        }

        // Verificar a quilometragem (um número inteiro positivo)
        if (quilometragem < 0) {
            return false;
        }

        // Se todas as verificações passaram, os dados são válidos
        return true;
    }

}

public class CarDemo {

    static int registerCars(Car[] cars) {
        Scanner sc = new Scanner(System.in);
        int numCarrosRegistrados = 0;
        System.out.println("Insira dados do carro (marca modelo ano quilômetros): ");
        while (true) {
            String input = sc.nextLine();

            // Verifica se o usuário inseriu uma linha vazia para encerrar o registro
            if (input.isEmpty()) {
                break;
            }

            // Divide a entrada usando espaço como delimitador
            String[] dadosCarro = input.split("\\s+");
            // Verifica se há informações suficientes
            if (dadosCarro.length == 4) {
                if (Car.verificarVeiculo(dadosCarro[0], dadosCarro[1], Integer.parseInt(dadosCarro[2]),
                        Integer.parseInt(dadosCarro[3]))) {
                    Car novoCarro = new Car(dadosCarro[0], dadosCarro[1], Integer.parseInt(dadosCarro[2]),
                            Integer.parseInt(dadosCarro[3]));
                    cars[numCarrosRegistrados] = novoCarro;
                    numCarrosRegistrados++;
                } else {
                    System.out.println("Formato inválido. Insira novamente.");
                }
            } else {
                System.out.println("Formato inválido. Insira novamente.");
            }
        }
        sc.close();
        return numCarrosRegistrados;
    }

    static void registerTrips(Car[] cars, int numCars) {
        // TODO: pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }
            String[] i = input.split(":");
            // Verifica se há informações suficientes
            if (i.length == 2) {
                cars[Integer.parseInt(i[0])].drive(Integer.parseInt(i[1]));
            } else {
                System.out.println("Formato inválido. Insira novamente.");
            }
        }

        sc.close();
    }

    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        // TODO: lista todos os carros registados
        // Exemplo de resultado
        // Carros registados:
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536
        for (int i = 0; i < cars.length; ++i) {
                System.out.println(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms: " + cars[i].kms);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[2];

        int numCars = registerCars(cars);

        if (numCars > 0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

    }
}