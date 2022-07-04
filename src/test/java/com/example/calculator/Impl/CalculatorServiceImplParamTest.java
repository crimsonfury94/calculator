package com.example.calculator.Impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculator.constants.CalculatorServiceImplConst.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("testsParams")
    @ParameterizedTest
    void returnCorrectResultToSum(int num1, int num2) {
        assertEquals(num1 + num2, out.plus((float) num1, (float) num2));
    }

    @MethodSource("testsParams")
    @ParameterizedTest
    void returnCorrectResultToMinus(int num1, int num2) {
        assertEquals(num1 - num2, out.minus((float) num1, (float) num2));
    }

    @MethodSource("testsParams")
    @ParameterizedTest
    void returnCorrectResultToMultiply(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply((float) num1, (float) num2));
    }

    @MethodSource("testsParams")
    @ParameterizedTest
    void returnCorrectResultToDivide(float num1, float num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    private static Stream<Arguments> testsParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, THREE),
                Arguments.of(TWO, ONE),
                Arguments.of(THREE, THREE));
    }
}