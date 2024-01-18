import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Customer;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order();
        
        System.out.println("Enter customer data");
        Customer customer = new Customer();

        System.out.print("Name: ");
        customer.setName(sc.nextLine());

        System.out.print("Email: ");
        customer.setEmail(sc.nextLine());

        System.out.print("Birth Date (MM/DD/YYYY): ");
        customer.setBirthDate(LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        order.setCustomer(customer);

        System.out.println();
        System.out.println("Enter order data");
        System.out.print("How many items you want to add to this order?: ");
        int items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            Product product = new Product();
            System.out.printf("Item #%d: %n", (i + 1));
            sc.nextLine();
            System.out.print("Product name: ");
            product.setName(sc.nextLine());
            System.out.print("Product price: ");
            product.setPrice(sc.nextDouble());

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(product, quantity);

            order.addOrderItem(orderItem);
            System.out.println();
        }

        System.out.println(order);

        sc.close();
        
    }
}
