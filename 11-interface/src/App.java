import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import services.ContractServices;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter contract number: ");
        Integer contractNumber = sc.nextInt();

        System.out.print("Enter contract date (MM/DD/YYYY): ");
        sc.nextLine();
        LocalDate contractDate = LocalDate.parse( sc.nextLine(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        System.out.print("Enter contract amount: ");
        Double contractAmount = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractAmount);

        System.out.print("Enter the number of installments: ");
        Integer contractInstallments = sc.nextInt();

        ContractServices.processContract(contract, contractInstallments);

        System.out.println("");
        System.out.println("Installments");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment.getDueDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + " - $" + String.format("%.2f", installment.getAmount()));
        }

        System.out.println();

        sc.close();

    }
}
