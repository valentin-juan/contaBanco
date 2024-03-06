import Conta.Conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to DioBank!");

        System.out.println("Nome do cliente:");
        conta.setAccountName(scanner.nextLine());

        System.out.println("Por favor, digite o número da agência:");
        conta.setAgency(scanner.nextLine());

        System.out.println("Número de conta:");
        conta.setNumberAccount(scanner.nextInt());

        System.out.println("Saldo:");
        conta.setBalance(scanner.nextDouble());

        System.out.println(conta.toString());
        scanner.close();
    }
}