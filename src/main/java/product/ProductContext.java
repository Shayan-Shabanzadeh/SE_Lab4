package product;

import calculator.WeightCalculator;

public class ProductContext {
    private ProductState state;
    private WeightCalculator weightCalculator;


    public ProductContext(ProductState state, WeightCalculator weightCalculator) {
        this.state = state;
        this.weightCalculator = weightCalculator;
    }

    public ProductState getState() {
        return state;
    }
}
