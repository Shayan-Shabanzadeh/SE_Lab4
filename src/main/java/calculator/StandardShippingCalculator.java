package calculator;

public class StandardShippingCalculator implements WeightCalculator {
    @Override
    public double calculatePrice(double weight) {
        return 2.5 * weight;
    }
}
