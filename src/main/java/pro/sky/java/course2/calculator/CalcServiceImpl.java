package pro.sky.java.course2.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String hello() {
        return "Решение по ДЗ урока «Вводное в Maven и Spring Boot + web»";
    }

    @Override
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double division(int num1, int num2) {
        return (float) num1 / num2;
    }


}
