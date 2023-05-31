package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcControllerTest {
    private int num1 = 5;
    private int num2 = 3;

    private final CalcService calcService = new CalcServiceImpl();
    private  CalcController calcController = new CalcController(calcService);
    @Test
    public void addition() {
        String expected = String.format("%d + %d = %d", num1, num2, num1 + num2);
        String actual = calcController.addition(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subtraction() {
        String expected = String.format("%d - %d = %d", num1, num2, num1 - num2);
        String actual = calcController.subtraction(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void additionNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcController.addition(num1, null));
    }

    @Test
    public void multiplication() {
        String expected = String.format("%d * %d = %d", num1, num2, num1 * num2);
        String actual = calcController.multiplication(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void multiplicationNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcController.multiplication(num1, null));
    }

    @Test
    public void division() {
        String expected = String.format("%d / %d = %.3f", num1, num2, (float) num1 / num2);
        String actual = calcController.division(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divisionNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcController.division(num1, null));
    }
    @Test
    public void divisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calcController.division(num1, 0));
    }
}
