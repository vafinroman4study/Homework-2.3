package pro.sky.java.course2.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String hello() {
        return "Решение по ДЗ урока «Вводное в Maven и Spring Boot + web»";
    }
}
