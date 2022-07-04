package com.example.calculator.Controller;

import com.example.calculator.Service.CalculatorService;
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
    public String plus(@RequestParam(value = "num1", required = false) Float num1,
                       @RequestParam(value = "num2", required = false) Float num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @RequestMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float num1,
                        @RequestParam(value = "num2", required = false) Float num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @RequestMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float num1,
                           @RequestParam(value = "num2", required = false) Float num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @RequestMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float num1,
                         @RequestParam(value = "num2", required = false) Float num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
