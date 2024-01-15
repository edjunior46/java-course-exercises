import java.util.Scanner;
import entities.Hospede;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serao alugados?: ");
        int count = sc.nextInt();
        Hospede[] hospedes = new Hospede[10];

        for (int i = 0; i < count; i++) {
            System.out.println("Aluguel #" + (i + 1) + ": ");
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            sc.nextLine();
            hospedes[quarto] = new Hospede();
            System.out.print("Nome: ");
            hospedes[quarto].setNome(sc.nextLine());
            System.out.print("Email: ");
            hospedes[quarto].setEmail(sc.nextLine());
            System.out.println();
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < hospedes.length; i++) {
            if (hospedes[i] != null) {
                System.out.printf("%d: %s, %s%n", i, hospedes[i].getNome(), hospedes[i].getEmail());
            }
        }

        sc.close();

    }
}
