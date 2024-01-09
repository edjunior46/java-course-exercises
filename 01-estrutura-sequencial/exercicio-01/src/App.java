import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* FAÇA UM PROGRAMA LER DOIS VALORES INTEIROS E DEPOIS MOSTRAR NA TELA A SOMA
        DESSES NÚMEROS COM UMA MENSAGEM EXPLICATIVA */

        Scanner sc = new Scanner(System.in);

        System.out.println("----- SOMANDO A COM B -----");

        System.out.print("Digite o valor de A: ");
        int varA = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int varB = sc.nextInt();

        System.out.println("Resultado: " + (varA + varB));

        sc.close();
    }
}
