import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de participantes: ");
        int count = sc.nextInt();
        double[] alturas = new double[count];
        double result = 0;
        System.out.println("Digite a altura dos participantes");

        for (int i = 0; i < count; i++) {
            alturas[i] = sc.nextDouble();
            result += alturas[i];
        }

        result = result/alturas.length;

        System.out.printf("Média das alturas: %.2f%n", result);

        

        sc.close();
    }
}
