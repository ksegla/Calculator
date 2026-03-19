package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void divide_shouldReturnQuotient() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.divide(8, 2));
    }

    @Test
    void divide_byZero_shouldThrow() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(8, 0));
    }
}