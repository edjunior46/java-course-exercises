import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== BANCO DO DINHEIRO =====");
        System.out.println("Cadastro de cliente");

        System.out.println();
        ContaBancaria contaBancaria;

        System.out.print("Digite seu nome: ");
        String titular = sc.nextLine();

        System.out.print("Deseja realizar um depósito inicial? s/n: ");
        if (sc.nextLine().charAt(0) == 's') {
            System.out.print("Digite o valor do deposito: ");
            double depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(titular, depositoInicial);
        } else {
            contaBancaria = new ContaBancaria(titular);
        }

        System.out.println();
        System.out.printf("Seja bem-vindo, %s!%nAqui estao os dados de sua conta:%n", contaBancaria.getTitular());
        System.out.println(contaBancaria.toString());

        System.out.println();
        System.out.println("Realize seu primeiro depósito.");
        System.out.print("Digite o valor que deseja depositar: ");
        contaBancaria.deposito(sc.nextDouble());

        System.out.println("Saldo atualizado");
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        System.out.println();
        System.out.printf("Realize seu primeiro saque. %nOBS: nós cobramos uma taxa de $5.00 por saque.%n");
        System.out.print("Digite o valor que deseja sacar: ");
        contaBancaria.retirada(sc.nextDouble());
        System.out.println("Saldo atualizado");
        System.out.println("Saldo: " + contaBancaria.getSaldo());

        sc.close();

    }
}
