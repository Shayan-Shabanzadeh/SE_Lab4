package product;

public interface ProductState {
    void printStatus();
    void nextState(ProductContext context);
}
