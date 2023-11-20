package product;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

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
        ProductState state = new InTransitState();
        ProductContext context = new ProductContext();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        state.nextState(context);

        System.setOut(System.out);

        String expectedOutput = "Package is already delivered. No further state change.";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}