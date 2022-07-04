package com.example.calculator.Impl;

import com.example.calculator.Service.CalculatorService;
import com.example.calculator.exception.CheckParameterException;
import com.example.calculator.exception.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public float plus(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new CheckParameterException();
        }
        return num1 + num2;
    }

    @Override
    public float minus(Float num1, Float num2) {
        if (num1 == 0 || num2 == 0) {
            throw new CheckParameterException();
        }
        return num1 - num2;
    }

    @Override
    public float multiply(Float num1, Float num2) {
        if (num1 == 0 || num2 == 0) {
            throw new CheckParameterException();
        }
        return num1 * num2;
    }

    @Override
    public float divide(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new CheckParameterException();
        }
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }

}
