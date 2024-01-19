import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.IndividualTaxpayer;
import entities.LegalTaxpayer;
import entities.Taxpayer;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int count = sc.nextInt();

        List<Taxpayer> taxpayers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Taxpayer #" + (i + 1) + " data: ");
            System.out.print("Name: ");
            sc.nextLine();
            String taxpayerName = sc.nextLine();
            System.out.print("Anual income: ");
            Double taxpayerIncome = sc.nextDouble();
            sc.nextLine();
            System.out.print("Individual or Legal? (i/l): ");
            char taxpayerType = sc.nextLine().charAt(0);
            if (taxpayerType == 'i') {
                System.out.print("Health expenditures: ");
                Double taxpayerSpent = sc.nextDouble();
                taxpayers.add(new IndividualTaxpayer(taxpayerName, taxpayerIncome, taxpayerSpent));
            } else {
                System.out.print("Number of employees: ");
                Integer taxpayerEmployees = sc.nextInt();
                taxpayers.add(new LegalTaxpayer(taxpayerName, taxpayerIncome, taxpayerEmployees));
            }
            System.out.println();
        }

        System.out.println("TAX");
        for (Taxpayer taxpayer : taxpayers) {
            System.out.println(taxpayer.getName() + " - $" + String.format("%.2f", taxpayer.tax()));
        }

        sc.close();

    }
}
