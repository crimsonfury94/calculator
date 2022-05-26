package com.example.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(path = "/")
    public String welcome() {
        return calculatorService.welcome();
    }

    @RequestMapping(path = "/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.plus(num1, num2);
    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.minus(num1, num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.multiply(num1, num2);
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorService.divide(num1, num2);
    }

}
