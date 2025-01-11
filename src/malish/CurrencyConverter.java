package malish;

import java.util.Scanner;

public class CurrencyConverter {


    public static void convertCurrency(double nprAmount) {
        // Assume exchange rates
        double nprToUsdRate = 0.0075;  // 1 NPR = 0.0075 USD
        double nprToCadRate = 0.010;   // 1 NPR = 0.010 CAD


        double usdAmount = nprAmount * nprToUsdRate;
        double cadAmount = nprAmount * nprToCadRate;

        // Display the results
        System.out.println("Amount in NPR: " + nprAmount);
        System.out.println("Equivalent in USD: " + usdAmount);
        System.out.println("Equivalent in CAD: " + cadAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in NPR: ");
        double nprAmount = scanner.nextDouble();

        convertCurrency(nprAmount);
    }
}
