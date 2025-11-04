import java.until.scanner;
import java.lang.Math;
public class MortgageCalculator {
    public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Principle Loan Amount:");
    double principle=scanner.next()double;
    System.out.print(Annual Intersest Rate(in%):);
    double annualInterstRate=scanner.nextdouble();
    System.out.print("Loan Term in Years");
      int loanTermYears=scanner.textInt;
      scanner.close();
        // Calculate monthly interest rate

        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate total number of payments

        int numberOfPayments = loanTermYears * 12;
    }
}
