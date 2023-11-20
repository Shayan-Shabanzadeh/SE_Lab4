package calculator;

public class ExpressShippingCalculator implements WeightCalculator {
    @Override
    public double calculatePrice(double weight) {
        return 3.5 * weight;
    }
}
