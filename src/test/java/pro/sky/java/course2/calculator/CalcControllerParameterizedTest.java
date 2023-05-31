package pro.sky.java.course2.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcControllerParameterizedTest {

    private static int num1 = 5;
    private static int num2 = 2;
    private static String answerAdd = String.format("%d + %d = %d", num1, num2, num1 + num2);
    private static String answerSub = String.format("%d - %d = %d", num1, num2, num1 - num2);
    private static String answerMult = String.format("%d * %d = %d", num1, num2, num1 * num2);
    private static String answerDiv = String.format("%d / %d = %.3f", num1, num2, (float) num1 / num2);
    private final CalcService service = new CalcServiceImpl();
    private final CalcController out = new CalcController(service);

    @ParameterizedTest
    @MethodSource("provideParametersForAdditionTest")
    public void addition(Integer num1, Integer num2, String expectedMessage) {
        String result = out.addition(num1, num2);
        assertEquals(expectedMessage, result);
    }
    @ParameterizedTest
    @MethodSource("provideParametersForSubtractionTest")
    public void subtraction(Integer num1, Integer num2, String expectedMessage) {
        String result = out.subtraction(num1, num2);
        assertEquals(expectedMessage, result);
    }
    @ParameterizedTest
    @MethodSource("provideParametersForMultiplicationTest")
    public void multiplication(Integer num1, Integer num2, String expectedMessage) {
        String result = out.multiplication(num1, num2);
        assertEquals(expectedMessage, result);
    }
    @ParameterizedTest
    @MethodSource("provideParametersForDivisionTest")
    public void division(Integer num1, Integer num2, String expectedMessage) {
        String result = out.division(num1, num2);
        assertEquals(expectedMessage, result);
    }

    public static Stream<Arguments> provideParametersForAdditionTest() {
        return Stream.of(
                Arguments.of(num1, num2, answerAdd)
        );
    }
    public static Stream<Arguments> provideParametersForSubtractionTest() {
        return Stream.of(
                Arguments.of(num1, num2, answerSub)
        );
    }
    public static Stream<Arguments> provideParametersForMultiplicationTest() {
            return Stream.of(
                    Arguments.of(num1, num2, answerMult)
            );
        }
    public static Stream<Arguments> provideParametersForDivisionTest() {
            return Stream.of(
                    Arguments.of(num1, num2, answerDiv)
            );
        }

}
