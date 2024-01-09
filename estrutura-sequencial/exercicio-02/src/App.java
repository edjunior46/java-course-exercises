import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * FAÇA UM PROGRAMA LER O VALOR DO RAIO DE UM CIRCULO, E DEPOIS MOSTRAR
         * O VALOR DA ÁREA DESTE CÍRCULO COM QUATRO CASAS DECIMAIS
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AREA DO CIRCULO =====");

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        final double PI = 3.14159;
        double area = PI * (raio * raio);

        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }
}
