import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void Before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(25.0, calculator.add(10, 15));
    }

    @Test
    public void subtract(){
        assertEquals(5.0, calculator.subtract(10, 15));
    }


    @Test
    public void multiply(){
        assertEquals(150.0, calculator.multiply(10, 15));
    }

    @Test
    public void divide(){
        assertEquals(1.5, calculator.divide(10, 15), 0.5);
    }
}
