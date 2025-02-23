import java.math.BigDecimal;

public class Individual extends Person {
    private BigDecimal healthExpenditures;

    public Individual(String name, BigDecimal annualIncome, BigDecimal healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal tax;
        if (annualIncome.compareTo(new BigDecimal("20000")) < 0) {
            tax = annualIncome.multiply(new BigDecimal("0.15"));
        } else {
            tax = annualIncome.multiply(new BigDecimal("0.25"));
        }

        if (healthExpenditures != null && healthExpenditures.signum() > 0) {
            BigDecimal healthDeduction = healthExpenditures.multiply(new BigDecimal("0.50"));
            tax = tax.subtract(healthDeduction);
        }

        return tax;
    }
}
