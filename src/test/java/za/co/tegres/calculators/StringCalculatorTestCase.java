package za.co.tegres.calculators;

import org.junit.Before;
import org.junit.Test;
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

}
