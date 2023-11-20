import calculator.ExpressShippingCalculator;
import calculator.StandardShippingCalculator;
import product.DeliveredState;
import product.ProductContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight of the package:");
        double weight = scanner.nextDouble();

        ProductContext productContext = new ProductContext();

        while (!(productContext.getState() instanceof DeliveredState)) {
            productContext.printStatus();
            System.out.println("Choose shipping method (1 for Standard, 2 for Express) or 3 to deliver the product:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                productContext.setWeightCalculator(new StandardShippingCalculator());
            } else if (choice == 2) {
                productContext.setWeightCalculator(new ExpressShippingCalculator());
            } else if (choice == 3) {
                productContext.nextState();
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
                continue;
            }

            System.out.println("Shipping cost: " + productContext.calculatePrice(weight));

        }

        scanner.close();
    }
}
