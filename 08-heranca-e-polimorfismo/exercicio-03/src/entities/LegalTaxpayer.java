package entities;

public final class LegalTaxpayer extends Taxpayer {

    private Integer employeesNumber;

    public LegalTaxpayer() {
        super();
    }

    public LegalTaxpayer(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public final Double tax() {
        Double result = 0.0;
        if (getEmployeesNumber() > 10) {
            result = getAnualIncome() * 1.4;
        } else {
            result = getAnualIncome() * 1.6;
        }
        return result;
    }
    
}
