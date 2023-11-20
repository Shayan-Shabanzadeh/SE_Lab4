package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightCalculatorTest {
    @Test
    void StandardCalculatePrice(){
        WeightCalculator weightCalculator = new StandardShippingCalculator();
        double price = weightCalculator.calculatePrice(20);
        assertEquals(50 , price);
    }

    @Test
    void ExpressCalculatePrice(){
        WeightCalculator weightCalculator = new StandardShippingCalculator();
        double price = weightCalculator.calculatePrice(20);
        assertEquals(70 , price);
    }
    
}