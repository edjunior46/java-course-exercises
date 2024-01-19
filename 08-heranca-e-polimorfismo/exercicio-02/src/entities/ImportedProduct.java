package entities;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + getCustomsFee();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" - $").append(String.format("%.2f", totalPrice()))
        .append(" (Customs Fee: $").append(String.format("%.2f", getCustomsFee())).append(")");
        return sb.toString();
    }

}
