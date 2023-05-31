package pro.sky.java.course2.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String hello() {
        return "Решение по ДЗ урока «Тестирование»";
    }

    @Override
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addition(Integer num1, Integer num2) {
        if (num1 == null | num2 == null) {
            throw new IllegalArgumentException("Введите, пожалуйста, два параметра num1 и num2.");
        } else {
            return num1 + num2;
        }
    }

    @Override
    public int multiplication(Integer num1, Integer num2) {
        if (num1 == null | num2 == null) {
            throw new IllegalArgumentException("Введите, пожалуйста, два параметра num1 и num2.");
        } else {
            return num1 * num2;
        }
    }

    @Override
    public double division(Integer num1, Integer num2) {
        if (num1 == null | num2 == null) {
            throw new IllegalArgumentException("Введите, пожалуйста, два параметра num1 и num2.");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на 0!");
        } else {
            return (float) num1 / num2;
        }
    }


}
