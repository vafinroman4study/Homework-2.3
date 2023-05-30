package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping
    public String hello() {
        return calcService.hello();
    }


    @GetMapping("/calculator")
    public String helloCalc() {
        return calcService.helloCalc();
    }

    @GetMapping("/calculator/plus")
    public String addition(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return "Введите, пожалуйста, два параметра num1 и num2.";
        } else {
            int res = calcService.addition(num1, num2);
            return String.format("%d + %d = %d", num1, num2, res);
        }
    }
    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return "Введите, пожалуйста, два параметра num1 и num2.";
        } else {
            int res = calcService.addition(num1, -num2);
            return String.format("%d - %d = %d", num1, num2, res);
        }
    }
    @GetMapping("/calculator/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1,
                                 @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return "Введите, пожалуйста, два параметра num1 и num2.";
        } else {
            int res = calcService.multiplication(num1, num2);
            return String.format("%d * %d = %d", num1, num2, res);
        }
    }
    @GetMapping("/calculator/divide")
    public String division(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (num1 == null | num2 == null) {
            return "Введите, пожалуйста, два параметра num1 и num2.";
        } else if (num2 == 0) {
            return "Нельзя делить на 0!";
        } else {
            double res = calcService.division(num1, num2);
            return String.format("%d / %d = %.3f", num1, num2, res);
        }
    }
}
