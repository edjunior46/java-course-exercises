import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor?: ");
        int count = sc.nextInt();

        int[] vectA = new int[count];
        int[] vectB = new int[count];
        int[] vectC = new int[count];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        sc.close();

    }
}
