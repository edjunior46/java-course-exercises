package model.entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    
    private Integer number;
    private LocalDate date;
    private Double amount;

    List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public Double getAmount() {
        return amount;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }

}
