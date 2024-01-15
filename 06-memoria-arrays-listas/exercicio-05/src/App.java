import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoas deseja analisar: ");
        Pessoa[] pessoas = new Pessoa[sc.nextInt()];

        double media = 0;
        double porcentagem = 0;
        
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            pessoas[i] = new Pessoa();
            System.out.printf("%nDigite o nome da %da pessoa: ", (i + 1));
            pessoas[i].setNome(sc.nextLine());
            System.out.printf("Digite a idade da %da pessoa: ", (i + 1));
            pessoas[i].setIdade(sc.nextInt());
            System.out.printf("Digite a altura da %da pessoa: ", (i + 1));
            pessoas[i].setAltura(sc.nextDouble());

            media += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 18) {
                porcentagem++;
            }

        }

        media = media / pessoas.length;
        porcentagem = (porcentagem / pessoas.length) * 100;

        System.out.println();
        System.out.printf("Altura media: %.2f%n", media);
        System.out.printf("Porcentagem de pessoas menores de idade: %.2f%n", porcentagem);
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 18) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();

    }
}
