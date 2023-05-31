package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/calculator")
    @GetMapping
    public String helloCalc() {
        return calcService.helloCalc();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        int res = calcService.addition(num1, num2);
        return String.format("%d + %d = %d", num1, num2, res);
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1,
                              @RequestParam(required = false) Integer num2) {
        int res = calcService.addition(num1, -num2);
        return String.format("%d - %d = %d", num1, num2, res);
    }
    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1,
                                 @RequestParam(required = false) Integer num2) {
         int res = calcService.multiplication(num1, num2);
         return String.format("%d * %d = %d", num1, num2, res);
    }
    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        double res = calcService.division(num1, num2);
        return String.format("%d / %d = %.3f", num1, num2, res);
    }
}
