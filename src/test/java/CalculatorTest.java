import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@Disabled("Feature is in under constractor")
@DisplayName("Testing calculator class")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default
public class CalculatorTest {


    @Test
    @DisplayName("Testing Calculator class add method") // alternative of method name
    public void addTest() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 2);
        assertEquals(3, result, 0);
        // assuming that example
        assumingThat(() -> "test".equals("test1"), () -> assertEquals(4, result, 0));
    }
}
