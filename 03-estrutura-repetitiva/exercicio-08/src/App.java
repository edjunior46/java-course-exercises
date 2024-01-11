import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        char repeat;

        do {
            
            System.out.print("Digite a temperatura em celsius: ");
            double varCelsius = sc.nextDouble();

            double varConvert = ((varCelsius * 9) / 5) + 32;

            System.out.println("Temperatura convertida em Fahrenheit: " + varConvert);
            System.out.print("Deseja executar novamente? s/n: ");
            repeat = sc.next().charAt(0);

        } while (repeat == 's');

        sc.close();

    }
}
