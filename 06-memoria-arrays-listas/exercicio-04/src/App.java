import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar?: ");
        double[] numbers = new double[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double media = 0;
        double soma = 0;

        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
        }

        media = soma / numbers.length;

        System.out.print("%nValores: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f ", numbers[i]);
        }
        System.out.println();
        System.out.printf("Soma: %.1f%n", soma);
        System.out.printf("Media: %.1f%n", media);

        sc.close();

    }
}
