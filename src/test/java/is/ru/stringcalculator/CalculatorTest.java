package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(3, Calculator.add("3"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testNewline(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testNewDelimiter(){
    	assertEquals(6, Calculator.add("//;\n1;2;3"));
    }

    @Test
    public void testThousandPlus(){
    	assertEquals(6, Calculator.add("1001,1,2,3"));
    }

}