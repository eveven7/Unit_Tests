package org.example.Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Mock
    private Calculator calculator; //object created empty, when we mock a class methods return a null

    @Test
    public void addNumbers_shouldReturnCorrectSum_withPositiveNumbers() {
        final int expected = 10;
        when(calculator.addNumbers(5, 5)).thenReturn(expected);
        final int actual = calculator.addNumbers(5, 5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addNumbers_shouldReturnFalseSum_withPositiveNumbers() {
        final int expected = 33;
        when(calculator.addNumbers(5, 5)).thenReturn(expected);
        final int actual = calculator.addNumbers(5, 5);
        assertThat(actual).isEqualTo(10);
    }

    @Test
    public void multiplyNumbers_shouldReturnTrue_withPositiveNumbers() {
        final int expected = 30;
        final int actual = calculator.multiplication(5, 6);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplyNumbers_shouldReturnFalse_withPositiveNumbers() {
        final int expected = 25;
        final int actual = calculator.multiplication(5, 6);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void multiplyNumbers_shouldReturnZero_withPositiveNumbers() {
        final int expected = 0;
        final int actual = calculator.multiplication(5, 6);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtractNumbers_shouldReturnTrue_withPositiveNumbers() {
        final int expected = 4;
        final int actual = calculator.subtraction(10, 6);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtractNumbers_shouldReturnZero_withPositiveNumbers() {
        final int expected = 0;
        final int actual = calculator.subtraction(10, 10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void subtractNumbers_shouldReturnFalse_withPositiveNumbers() {
        final int expected = 5;
        final int actual = calculator.subtraction(10, 4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideNumbers_shouldReturnTrue_withPositiveNumbers() {
        final int expected = 5;
        final int actual = calculator.division(10, 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void divideNumbers_shouldReturnFalse_withPositiveNumbers() {
        final int expected = 3;
        final int actual = calculator.division(10, 2);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void divideNumbers_shouldReturnZero_withPositiveNumbers() {
        final int expected = 0;
        final int actual = calculator.division(10, 0);
        assertThat(actual).isEqualTo(expected);
    }
}
