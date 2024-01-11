import java.util.Locale;
import java.util.Scanner;
import util.IOF;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dolar: ");
        double valorDolar = sc.nextDouble();

        System.out.print("Digite a quantidade desejada: ");
        double qtdeDolar = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais: %.2f%n", (IOF.aplicaIOF(qtdeDolar) * valorDolar));

        sc.close();

    }
}
