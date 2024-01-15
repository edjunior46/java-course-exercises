import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar?: ");
        int[] numbers = new int[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("Numeros pares: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de numeros pares: " + count);

        sc.close();

    }
}
