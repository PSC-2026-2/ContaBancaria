import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        ArrayList<Conta> contas = new ArrayList<>();
        do {
            System.out.println("::::::BANCO XPTO:::::::");
            System.out.println("[1] Cadastrar conta");
            System.out.println("[2] Consultar saldo");
            System.out.println("[3] Depositar");
            System.out.println("[4] Sacar");
            System.out.println("[5] Mostrar dados de uma conta");
            System.out.println("[6] Mostrar dados de todas as contas");
            System.out.println("[0] Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    sc.nextLine();
                    System.out.println("Informe o nome do titular da conta: ");
                    String nome = sc.nextLine();
                    num++;
                    contas.add(new Conta(num, nome));
                }
                case 2 -> {
                    System.out.println("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    if (!contas.isEmpty()) {
                        for (Conta c : contas) {
                            if (c.getNumero() == numero) {
                                System.out.println("Saldo: " + c.getSaldo());
                            } else {
                                System.out.println("Conta não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada!");
                    }
                }
                case 3 -> {
                    System.out.println("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    if (!contas.isEmpty()) {
                        for (Conta c : contas) {
                            if (c.getNumero() == numero) {
                                System.out.println("Valor do depósito: ");
                                double valor = sc.nextDouble();
                                System.out.println(c.depositar(valor));

                            } else {
                                System.out.println("Conta não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada!");
                    }

                }
                case 4 -> {
                    System.out.println("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    if (!contas.isEmpty()) {
                        for (Conta c : contas) {
                            if (c.getNumero() == numero) {
                                System.out.println("Valor do saque: ");
                                double valor = sc.nextDouble();
                                System.out.println(c.sacar(valor));
                            } else {
                                System.out.println("Conta não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada!");
                    }
                }
                case 5 -> {
                    System.out.println("Informe o número da conta: ");
                    int numero = sc.nextInt();
                    if (!contas.isEmpty()) {
                        for (Conta c : contas) {
                            if (c.getNumero() == numero) {
                                System.out.println(c.mostrarDados());
                            } else {
                                System.out.println("Conta não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada!");
                    }
                }
                case 6 -> {
                    if (!contas.isEmpty()) {
                        for (Conta c : contas) {
                            System.out.println(c.mostrarDados());
                            System.out.println("------------");
                        }
                    } else {
                        System.out.println("Nenhuma conta cadastrada!");

                    }
                }
                case 0 -> {
                    System.out.println("Programa encerrado!");

                }
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

    }

}