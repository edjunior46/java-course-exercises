import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int count = 0;

        do {
            System.out.print("Digite quantos números deseja analisar: ");
            count = sc.nextInt();
            if (count > 10) {
                System.out.println("Invalido! Digite uma quantidade ate 10");
                System.out.println();
            }
        } while (count > 10);

        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Numeros negativos: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();

    }
}
