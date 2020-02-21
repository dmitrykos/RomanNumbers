import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest
{
    RomanNumber number = new RomanNumber();

    @Test
    public void testPredefinedResult1To5()
    {
        assertThat(number.calculate(1), equalTo("I"));
        assertThat(number.calculate(2), equalTo("II"));
        assertThat(number.calculate(3), equalTo("III"));
        assertThat(number.calculate(4), equalTo("IV"));
        assertThat(number.calculate(5), equalTo("V"));
    }
    @Test public void testPredefinedResult6To10()
    {
        assertThat(number.calculate(6), equalTo("VI"));
        assertThat(number.calculate(7), equalTo("VII"));
        assertThat(number.calculate(8), equalTo("VIII"));
        assertThat(number.calculate(9), equalTo("IX"));
        assertThat(number.calculate(10), equalTo("X"));
    }
    @Test public void testPredefinedResult11To15()
    {
        assertThat(number.calculate(11), equalTo("XI"));
        assertThat(number.calculate(12), equalTo("XII"));
        assertThat(number.calculate(14), equalTo("XIV"));
        assertThat(number.calculate(15), equalTo("XV"));
    }
    @Test public void testPredefinedResult16To20()
    {
        assertThat(number.calculate(16), equalTo("XVI"));
        assertThat(number.calculate(17), equalTo("XVII"));
        //assertThat(number.calculate(19), equalTo("IXX"));
        // assertThat(number.calculate(20), equalTo("XX"));
    }
}
