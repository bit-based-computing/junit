import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 2);
        assertEquals(3, result, 0);
    }
}
