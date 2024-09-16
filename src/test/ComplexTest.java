package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class    ComplexTest {

    @Test
    public void testMinus() {
        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 1);
        c1.minus(c2);

        assertEquals(3, c1.re);
        assertEquals(2, c1.im);
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex(2, 1);
        Complex result = c1.divide(c2);

        assertEquals(2.0, result.re, 0.001);
        assertEquals(0.0, result.im, 0.001);
    }

    @Test
    public void testDivideByZero() {
        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex(0, 0);

        assertThrows(ArithmeticException.class, () -> {
            c1.divide(c2);
        });
    }
}
