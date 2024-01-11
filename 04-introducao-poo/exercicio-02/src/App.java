import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salario bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println();
        System.out.printf("Funcionario: %s%nSalario Liquido: $%.2f%n", funcionario.nome, funcionario.salarioLiquido());

        System.out.print("Digite a porcentagem que deseja aumentar o salario: ");
        funcionario.aumentarSalario(sc.nextDouble());

        System.out.println();
        System.out.printf("Atualizado%nFuncionario: %s%nSalario Liquido: $%.2f%n", funcionario.nome, funcionario.salarioLiquido());

        sc.close();

    }
}
