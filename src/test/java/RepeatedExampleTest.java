import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedExampleTest {
    @DisplayName("Calculator class subtraction test")
    @RepeatedTest(value = 5)
//    @RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition}/{totalRepetitions}")
//    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
//    @RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
    public void subTest() {
        Calculator calculator = new Calculator();
        double result = calculator.sub(1, 2);
        assertEquals(-1, result, 0);
    }
}
