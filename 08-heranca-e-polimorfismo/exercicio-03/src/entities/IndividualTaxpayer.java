package entities;

public final class IndividualTaxpayer extends Taxpayer {

    private Double healthSpending;

    public IndividualTaxpayer() {
        super();
    }

    public IndividualTaxpayer(String name, Double anualIncome, Double healthSpending) {
        super(name, anualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public final Double tax() {
        Double result = 0.0;
        if (getAnualIncome() > 20000.0) {
            result = getAnualIncome() * 0.25;
        } else { 
            result = getAnualIncome() * 0.15;
        }

        if (healthSpending > 0) result -= (healthSpending * 0.5);

        return result;
    }

}
