package product;

import static org.junit.jupiter.api.Assertions.*;

import calculator.ExpressShippingCalculator;
import calculator.StandardShippingCalculator;
import org.junit.jupiter.api.Test;

class ProductContextTest {

    @Test
    void initialStateShouldBeInTransit() {
        // ProductContext productContext = new ProductContext();
        // assertTrue(productContext.getState() instanceof InTransitState);
    }

    @Test
    void nextStateShouldChangeStateToDelivered() {
        // ProductContext productContext = new ProductContext();
        // productContext.nextState();
        // assertTrue(productContext.getState() instanceof DeliveredState);
    }

    @Test
    void settingStandardShippingShouldCalculatePriceCorrectly() {
        // ProductContext productContext = new ProductContext();
        // productContext.setWeightCalculator(new StandardShippingCalculator());
        // double price = productContext.calculatePrice(5.0);
        // assertEquals(12.5, price, 0.01);
    }

    @Test
    void settingExpressShippingShouldCalculatePriceCorrectly() {
        // ProductContext productContext = new ProductContext();
        // productContext.setWeightCalculator(new ExpressShippingCalculator());
        // double price = productContext.calculatePrice(5.0);
        // assertEquals(17.5, price, 0.01);
    }

}
