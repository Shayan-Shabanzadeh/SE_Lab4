package product;

public class DeliveredState implements ProductState {
    @Override
    public void printStatus() {
        System.out.println("Package has been delivered.");
    }

    @Override
    public void nextState(ProductContext context) {
        System.out.println("Package is already delivered. No further state change.");
    }
}
