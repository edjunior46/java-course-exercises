import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
         * dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este 
         * valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
         * deverá ser impressa a mensagem “Fora de intervalo”
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double varNum = sc.nextDouble();

        if (varNum >= 0 && varNum < 25) {
            System.out.println("No intervalo [0, 24]");
        } else if (varNum >= 25 && varNum < 50) {
            System.out.println("No intervalo [25,49]");
        } else if (varNum >= 50 && varNum < 74) {
            System.out.println("No intervalo [50, 74]");
        } else if (varNum >= 75 && varNum <= 100) {
            System.out.println("No intervalo [75, 100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();

    }
}
