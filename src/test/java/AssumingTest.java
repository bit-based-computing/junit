import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumingTest {
    @Test
    @DisplayName("Testing Calculator class add method") // alternative of method name
    public void addTest() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 2);
        assumingThat(() -> "test".equals("test1"), () -> assertEquals(4, result, 0));
    }
}
