import java.util.Scanner;
import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja analisar?: ");
        Pessoa[] pessoas = new Pessoa[sc.nextInt()];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            pessoas[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(sc.nextInt());
        }

        System.out.print("Pessoa mais velha: ");
        int maisVelhaIndex = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > pessoas[maisVelhaIndex].getIdade()) {
                maisVelhaIndex = i;
            }
        }
        
        System.out.print(pessoas[maisVelhaIndex].getNome()+ ", " + pessoas[maisVelhaIndex].getIdade() + " anos");

        sc.close();

    }
}
