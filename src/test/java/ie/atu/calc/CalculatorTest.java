package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calculator();
        assertEquals(25, myCalc.add(10, 15));
    }

    @Test
    public void testMultiply()
    {
        myCalc = new Calculator();
        assertEquals(10, myCalc.multiply(2, 5));
    }

    @Test
    public void testSubtract()
    {
        myCalc = new Calculator();
        assertEquals(5, myCalc.subtract(15, 10));
    }

    @Test
    public void testDivide()
    {
        myCalc = new Calculator();
        assertEquals(5, myCalc.divide(25, 5));
    }
}
