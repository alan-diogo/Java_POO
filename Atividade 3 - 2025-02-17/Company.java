import java.math.BigDecimal;

public class Company extends Person {
    private int numberOfEmployees;

    public Company(String name, BigDecimal annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public BigDecimal calculateTax() {
        BigDecimal tax;
        if (numberOfEmployees > 10) {
            tax = annualIncome.multiply(new BigDecimal("0.14"));
        } else {
            tax = annualIncome.multiply(new BigDecimal("0.16"));
        }
        return tax;
    }
}
