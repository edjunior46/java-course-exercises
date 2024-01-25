package services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractServices {
    
    public static void processContract(Contract contract, Integer months) {
        PaymentService paymentService = new PaypalPayment();
        for (int i = 0; i < months; i++) {
            Double amount = contract.getAmount() / months;
            amount += interest(amount, (i + 1));
            amount += paymentService.paymentFee(amount);
            contract.addInstallment(new Installment(contract.getDate().plusMonths((i + 1)), amount));
        }
    }

    private static Double interest(Double amount, Integer months) {
        return (amount * 0.01) * months;
    }

}
