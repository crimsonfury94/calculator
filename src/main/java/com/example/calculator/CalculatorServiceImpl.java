package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public String plus(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "<b>Проверьте наличие параметров!</b>";
        }
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "<b>Проверьте наличие параметров!</b>";
        }
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "<b>Проверьте наличие параметров!</b>";
        }
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(String num1, String num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "<b>Проверьте наличие параметров!</b>";
        } else if (num2.equals(String.valueOf(0))) {
            return "<b>Пространство схлопнулось</b>";
        }
        double result = Double.parseDouble(num1) / Double.parseDouble(num2);
        return num1 + " / " + num2 + " = " + result;
    }

}
