import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos no vetor?: ");
        double[] vect = new double[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Media dos valores: ");
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            media += vect[i];
        }
        media = media / vect.length;
        System.out.printf("%.2f%n", media);

        System.out.println();
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }
}
