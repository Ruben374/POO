package aula06;

import java.util.Scanner;

import aula05.DateYMD;

public class Contact {
    private Pessoa person;
    private String phoneNumber;
    private String email;
    private int id;
    private static int ultimo = 1;

    public Contact(Pessoa person, String phoneNumber, String email) {
        if (!(phoneNumber == null || phoneNumber.isEmpty()) && !(email == null || email.isEmpty())) {
            this.person = person;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.id = ++ultimo;
        }
    }

    @Override
    public String toString() {
        return this.person.toString() + " - " + this.phoneNumber + " - " + this.email;
    }

    public boolean ValidPhoneNumber(String number) {
        String regex = "^9\\d{8}$";
        return number.matches(regex);
    }

    public boolean ValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public void setPhoneNumber(String phoneNumber) {
        if (ValidPhoneNumber(phoneNumber))
            this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        if (ValidEmail(email))
            this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact[] contactos = new Contact[100];
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Inserir contato");
                    boolean inserido = false;
                    System.out.println("Digite o nome do contato: ");
                    String name = scanner.next();
                    System.out.println("Digite a data de nascimento: dd/mm/aaaa");
                    String birthday = scanner.next();
                    System.out.println("Digite o número do cartão de cidadão: ");
                    int cc = scanner.nextInt();
                    System.out.println("Digite o número de telefone: (999) 9999-9999");
                    String phoneNumber = scanner.next();
                    System.out.println("Digite o endereço de e-mail: exemplo@example.com");
                    String email = scanner.next();
                    String[] b = birthday.split("/");
                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] == null) {
                            contactos[i] = new Contact(
                                    new Pessoa(name,
                                            new DateYMD(Integer.parseInt(b[0]), Integer.parseInt(b[1]),
                                                    Integer.parseInt(b[2])),
                                            cc),
                                    phoneNumber,
                                    email);
                            inserido = true;
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada: Alterar contacto");
                    System.out.println("Digite o ID do contato que deseja alterar: ");
                    int idAlterar = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] != null && contactos[i].id == idAlterar) {
                            encontrado = true;
                            System.out.println("Digite o novo número de telefone: ");
                            String novoNumero = scanner.next();
                            System.out.println("Digite o novo endereço de e-mail: ");
                            String novoEmail = scanner.next();
                            contactos[i].setPhoneNumber(novoNumero);
                            contactos[i].setEmail(novoEmail);
                            System.out.println("Contato alterado com sucesso.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada: Apagar contacto");
                    System.out.println("Digite o ID do contato que deseja apagar: ");
                    int idApagar = scanner.nextInt();
                    boolean removido = false;
                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] != null && contactos[i].id == idApagar) {
                            contactos[i] = null;
                            removido = true;
                            System.out.println("Contato apagado com sucesso.");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Opção 4 selecionada: Procurar contacto");
                    System.out.println("Digite o nome do contato que deseja procurar: ");
                    String nomeProcurar = scanner.next();
                    boolean e = false;
                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] != null && contactos[i].person.getName().equalsIgnoreCase(nomeProcurar)) {
                            System.out.println("Contato encontrado:");
                            System.out.println(contactos[i]);
                            e = true;
                            break;
                        }
                    }
                    if (!e) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Opção 5 selecionada: Listar contatos");

                    for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] != null) {
                            System.out.println(contactos[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Opção 0 selecionada: Sair");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

}
