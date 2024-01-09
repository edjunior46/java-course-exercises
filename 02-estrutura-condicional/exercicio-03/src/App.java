import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
         * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
         * múltiplos entre si. Atenção: os números devem poder ser digitados em 
         * ordem crescente ou decrescente
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números inteiros: ");
        int varA = sc.nextInt();
        int varB = sc.nextInt();

        if (varA % varB == 0) {
            if (varA % varB == 0) {
                System.out.printf("%d e %d sao múltiplos%n", varA, varB);
            } else {
                System.out.printf("%d e %d nao sao múltiplos%n", varA, varB);
            }
        } else {
            if (varB % varA == 0) {
                System.out.printf("%d e %d sao múltiplos%n", varA, varB);
            } else {
                System.out.printf("%d e %d nao sao múltiplos%n", varA, varB);
            }
        }

        sc.close();
    }
}
