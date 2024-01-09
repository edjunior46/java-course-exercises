import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * FAÇA UM PROGRAMA LER QUATRO VALORES INTEIROS, DEPOIS CALCULE E MOSTRE
         * A DIFERENÇA DO PRODUTO DE A E B PELO PRODUTO DE C E D.
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("===== DIFERENÇA DE PRODUTOS =====");

        int varA, varB, varC, varD;

        System.out.print("Digite o valor de A: ");
        varA = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        varB = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        varC = sc.nextInt();

        System.out.print("Digite o valor de D: ");
        varD = sc.nextInt();

        System.out.println("");

        int prodAB = varA * varB;
        int prodCD = varC * varD;
        int prodDiff = prodAB - prodCD;

        System.out.printf("O produto de A por B é: %d%n", prodAB);
        System.out.printf("O produto de C por D é: %d%n", prodCD);
        System.out.printf("A diferença dos produtos é: %d%n", prodDiff);

        System.out.println("");

        sc.close();
    }
}
