import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao analisadas?: ");
        Pessoa[] pessoas = new Pessoa[sc.nextInt()];

        System.out.println();

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.printf("Digite a altura da %da pessoa: ", (i + 1));
            pessoas[i].setAltura(sc.nextDouble());
            sc.nextLine();
            System.out.printf("Digite o genero da %da pessoa (m/f): ", (i + 1));
            pessoas[i].setGenero(sc.nextLine().charAt(0));
            System.out.println();
        }

        System.out.print("Maior altura: ");
        int maiorAlturaIndex = 0;
        for(int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > pessoas[maiorAlturaIndex].getAltura()) {
                maiorAlturaIndex = i;
            }
        }
        System.out.print(pessoas[maiorAlturaIndex].getAltura());

        System.out.println();
        System.out.print("Menor altura: ");
        int menorAlturaIndex = 0;
        for(int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() < pessoas[menorAlturaIndex].getAltura()) {
                menorAlturaIndex = i;
            }
        }
        System.out.print(pessoas[menorAlturaIndex].getAltura());

        System.out.println();
        System.out.print("Media de altura das mulheres: ");
        double mediaMulheres = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            mediaMulheres += pessoas[i].getAltura();
        }
        mediaMulheres = mediaMulheres / pessoas.length;
        System.out.printf("%.2f", mediaMulheres);

        System.out.println();
        System.out.print("Quantidade de homens: ");
        int countHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getGenero() == 'm') {
                countHomens++;
            }
        }
        System.out.print(countHomens);

        sc.close();

    }
}
