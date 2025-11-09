import java.util.Scanner;
 
public class MortgageCalculator {
    public static void main(String[] args) {
 
        try (Scanner input = new Scanner(System.in)) {
 
            System.out.print("Enter Loan Amount (USD): ");
            double P = input.nextDouble();
            while (P <= 0) {
                System.out.print("Please enter a positive loan amount (USD): ");
                P = input.nextDouble();
            }
 
            System.out.print("Enter Annual Interest Rate (%): ");
            double annualRate = input.nextDouble();
            while (annualRate < 0) {
                System.out.print("Please enter a non-negative interest rate (%): ");
                annualRate = input.nextDouble();
            }
 
            System.out.print("Enter Loan Duration (Years): ");
            int years = input.nextInt();
            while (years <= 0) {
                System.out.print("Please enter a positive loan duration (Years): ");
                years = input.nextInt();
            }
 
            double r = annualRate / 100.0 / 12.0;
            int n = years * 12;
 
            double monthlyPayment;
            if (Math.abs(r) < 1e-12) {
                monthlyPayment = P / n;
            } else {
                monthlyPayment = P * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
            }
 
            System.out.printf("Monthly Mortgage Payment (USD): %.2f%n", monthlyPayment);
        }
    }
}
 