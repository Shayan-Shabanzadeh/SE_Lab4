package product;

import calculator.StandardShippingCalculator;
import calculator.WeightCalculator;

public class ProductContext {
    private ProductState state;
    private WeightCalculator weightCalculator;

    public ProductContext() {
        this.state = new InTransitState();
        this.weightCalculator = new StandardShippingCalculator();
    }

    public ProductContext(ProductState state, WeightCalculator weightCalculator) {
        this.state = state;
        this.weightCalculator = weightCalculator;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public ProductState getState() {
        return state;
    }

    public void setWeightCalculator(WeightCalculator weightCalculator) {
        this.weightCalculator = weightCalculator;
    }

    public void printStatus() {
        state.printStatus();
    }

    public double calculatePrice(double weight) {
        return weightCalculator.calculatePrice(weight);
    }

    public void nextState() {
        state.nextState(this);
    }
}
