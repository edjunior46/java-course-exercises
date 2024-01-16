import java.util.ArrayList;
import java.util.Scanner;
import entities.Funcionario;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serao cadastrados?: ");
        int count = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            funcionarios.add(new Funcionario());
            System.out.println("#" + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine();
            funcionarios.get(i).setNome(sc.nextLine());
            System.out.print("Salario: ");
            funcionarios.get(i).setSalario(sc.nextDouble());
            System.out.println();
        }

        System.out.println("Lista de funcionarios");
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("ID: %d, Nome: %s, Salario: $%.2f%n", funcionario.getId(), funcionario.getNome(), funcionario.getSalario());
        }

        System.out.println();
        System.out.print("Digite o ID do funcionário que deseja aumentar o salario: ");
        int posicao = verificaID(sc.nextInt(), funcionarios);
        if (posicao == -1){
            System.out.println("Funcionario nao encontrado. Verifique o Id");
        } else {
            System.out.print("Digite a porcentagem que deseja aumentar o salario: ");
            funcionarios.get(posicao).aumentarSalario(sc.nextDouble());
        }

        System.out.println();
        System.out.println("Lista de funcionarios");
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("ID: %d, Nome: %s, Salario: $%.2f%n", funcionario.getId(), funcionario.getNome(), funcionario.getSalario());
        }

        sc.close();

    }

    public static int verificaID(int id, List<Funcionario> funcionarios) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
