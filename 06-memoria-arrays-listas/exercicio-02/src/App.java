import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de produtos que deseja cadastrar: ");
        Product[] produtos = new Product[sc.nextInt()];
        double media = 0;

        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Product();
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i].setNome(sc.next());
            System.out.printf("Digite o preco do produto %d: ", (i + 1));
            produtos[i].setPreco(sc.nextDouble());
            System.out.println();
            media += produtos[i].getPreco();
        }

        media = media / produtos.length;
        System.out.println("Produtos cadastrados");

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Nome: %s - Preco: $%.2f %n", produtos[i].getNome(), produtos[i].getPreco());
        }

        System.out.println();


        System.out.printf("Media de preco dos produtos: $%.2f", media);

        sc.close();

    }
}
