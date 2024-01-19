package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    
    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" (Used - Manufactured date: ")
        .append(getManufactureDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")))
        .append(")");
        return sb.toString();
    }

}
