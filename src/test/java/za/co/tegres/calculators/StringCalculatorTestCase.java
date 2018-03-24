package za.co.tegres.calculators;

import org.junit.Before;
import org.junit.Test;
import za.co.tegres.calculators.exceptions.NegativeNumberNotSupportedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class StringCalculatorTestCase {

    private StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test
    public void givenEmptyStringWhenAddThenReturnZero() {
        int sum = calculator.Add("");
        assertThat(sum, is(0));
    }

    @Test
    public void givenSingleNumberWhenAddReturnGivenNumber() {
        int sum = calculator.Add("1");
        assertThat(sum, is(1));
    }

    @Test
    public void givenMultipleNumbersWhenAddReturnSum() {
        int sum = calculator.Add("1,2");
        assertThat(sum, is(3));
    }

    @Test
    public void givenNewLineWhenAddReturnSum() {
        int sum = calculator.Add("1\n2,3");
        assertThat(sum, is(6));
    }

    @Test
    public void givenMultipleDelimitersWhenAddReturnSum() {
        int sum = calculator.Add("//;\\n1;2");
        assertThat(sum, is(3));
    }

    @Test
    public void givenNegativeNumberWhenAddReturnException() {
        try {
            calculator.Add("-2,-3");
            fail();
        } catch (NegativeNumberNotSupportedException e) {
            assertEquals("negatives not allowed [-2, -3]", e.getMessage());
        }
    }
}
