import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto e a quantidade: ");
        int cod = sc.nextInt();
        int quantidade = sc.nextInt();

        double total = 0;

        switch (cod) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                System.out.println("Produto nao disponivel");
                break;
        }

        System.out.printf("Total: R$%.2f%n", total);

        sc.close();

    }
}
