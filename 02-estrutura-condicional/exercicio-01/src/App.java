import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int varNum = sc.nextInt();

        if (varNum >= 0) {
            System.out.println("Este número é POSITIVO");
        } else {
            System.out.println("Este número é NEGATIVO");
        }

         sc.close();
    }
}
