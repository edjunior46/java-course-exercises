import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos do vetor: ");
        int[] vect = new int[sc.nextInt()];
        int count = 0;
        double media = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                count++;
                media += vect[i];
            }
        }

        media = media / count;

        if (count == 0) {
            System.out.println("Nenhum numero par identificado");
        } else {
            System.out.printf("Media dos pares: %.1f%n", media);
        }



        sc.close();

    }
}
