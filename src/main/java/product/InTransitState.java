package product;

public class InTransitState implements ProductState {
    @Override
    public void printStatus() {
        System.out.println("Package is in transit.");
    }

    @Override
    public void nextState(ProductContext context) {
        System.out.println("Package state changed to Delivered.");
        context.setState(new DeliveredState());
    }
}
