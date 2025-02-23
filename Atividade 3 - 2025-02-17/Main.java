import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberPayers = scanner.nextInt();
        scanner.nextLine();

        LinkedList<Person> taxPayers = new LinkedList<>();
        BigDecimal totalTaxes = BigDecimal.ZERO;

        for (int i = 0; i < numberPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = scanner.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Annual income: ");
            BigDecimal annualIncome = new BigDecimal(scanner.nextLine());

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                BigDecimal healthExpenditures = new BigDecimal(scanner.nextLine());

                Individual individual = new Individual(name, annualIncome, healthExpenditures);
                taxPayers.add(individual);
            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = Integer.parseInt(scanner.nextLine());

                Company company = new Company(name, annualIncome, numberOfEmployees);
                taxPayers.add(company);
            }
        }

        System.out.println("\nTAXES PAID:");
        for (Person payer : taxPayers) {
            BigDecimal tax = payer.calculateTax();
            totalTaxes = totalTaxes.add(tax);
            System.out.println(payer.getName() + ": $ " + tax.setScale(2, BigDecimal.ROUND_HALF_UP));
        }

        System.out.println("\nTOTAL TAXES: $ " + totalTaxes.setScale(2, BigDecimal.ROUND_HALF_UP));

        scanner.close();
    }
}
