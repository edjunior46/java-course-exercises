import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Fazer um programa para ler o código de uma peça A, o número de peças A, 
         * o valor unitário de cada peça A, o código de uma peça B, o número de peças B 
         * e o valor unitário de cada peça B. Calcule e mostre o valor a ser pago.
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código, a quantidade e o valor unitário das peças A: ");
        int prodCodA = sc.nextInt();
        int prodQtdeA = sc.nextInt();
        double prodValorA = sc.nextDouble();

        System.out.println();

        System.out.print("Digite o código, a quantidade e o valor unitário das peças B: ");
        int prodCodB = sc.nextInt();
        int prodQtdeB = sc.nextInt();
        double prodValorB = sc.nextDouble();

        double prodABFinal = (prodQtdeA * prodValorA) + (prodQtdeB * prodValorB);

        System.out.println();

        System.out.printf("Valor total a ser pago: R$%.2f%n", prodABFinal);

        sc.close();

    }
}
