import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int varNum = sc.nextInt();

        if (varNum % 2 != 0) {
            System.out.println("Este número é IMPAR");
        } else {
            System.out.println("Este número é PAR");
        }
        
         sc.close();
    }
}
