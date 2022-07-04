package com.example.calculator.Impl;

import com.example.calculator.exception.DivideByZeroException;
import org.junit.jupiter.api.Test;

import static com.example.calculator.constants.CalculatorServiceImplConst.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void threePlusTwoIsFive() {
        assertEquals(5, out.plus((float) THREE, (float) TWO));
    }

    @Test
    void twoPlusTwoIsFour() {
        assertEquals(4, out.plus((float) TWO, (float) TWO));
    }

    @Test
    void twoMinusOneIsOne() {
        assertEquals(1, out.minus((float) TWO, (float) ONE));
    }

    @Test
    void threeMinusOneIsTwo() {
        assertEquals(2, out.minus((float) THREE, (float) ONE));
    }

    @Test
    void threeMultiplyTwoIsSix() {
        assertEquals(6, out.multiply((float) THREE, (float) TWO));
    }

    @Test
    void oneMultiplyThreeIsThree() {
        assertEquals(3, out.multiply((float) ONE, (float) THREE));
    }

    @Test
    void oneDivideOneIsOne() {
        assertEquals(1, out.divide((float) ONE, (float) ONE));
    }

    @Test
    void twoDivideOneIsTwo() {
        assertEquals(2, out.divide((float) TWO, (float) ONE));
    }

    @Test
    void divideByZero() {
        assertThrows(DivideByZeroException.class, () ->out.divide((float) TWO, (float) ZERO));
    }
}