import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int count = sc.nextInt();

        List<Product> products = new ArrayList<>();
        
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Product #" + (i + 1) + ": ");
            System.out.print("Enter the type of product (c/u/i): ");
            char productType = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();
            switch (productType) {
                case 'c':
                    sc.nextLine();
                    products.add(new Product(productName, productPrice));
                    break;
                case 'u':
                    System.out.print("Manufacture date (MM/DD/YYYY): ");
                    sc.nextLine();
                    LocalDate productManufacture = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                    products.add(new UsedProduct(productName, productPrice, productManufacture));
                    break;
                case 'i':
                    System.out.print("Customs Fee: ");
                    Double productFee = sc.nextDouble();
                    sc.nextLine();
                    products.add(new ImportedProduct(productName, productPrice, productFee));
                default:
                    break;
            }
            
        }

        for (Product product : products) {
            System.out.println(product);
        }

        sc.close();

    }
}
