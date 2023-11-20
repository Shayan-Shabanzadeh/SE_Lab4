package product;

import calculator.StandardShippingCalculator;
import calculator.WeightCalculator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InTransitStateTest {

    @Test
    public void testPrintStatus() {
        ProductState state = new InTransitState();
        String expectedStatus = "Package is in transit.";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        state.printStatus();

        System.setOut(System.out);

        assertEquals(expectedStatus, outputStream.toString().trim());
    }

    @Test
    public void testNextState() {
        InTransitState inTransitState = new InTransitState();
        WeightCalculator weightCalculator = new StandardShippingCalculator();
        ProductContext context = new ProductContext(inTransitState, weightCalculator);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        inTransitState.nextState(context);

        System.setOut(System.out);
        String expectedOutput = "Package state changed to Delivered.";
        assertEquals(expectedOutput, outputStream.toString().trim());
        assertTrue(context.getState() instanceof DeliveredState);
    }
}