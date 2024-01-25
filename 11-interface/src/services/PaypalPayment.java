package services;

public class PaypalPayment implements PaymentService {

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

}
