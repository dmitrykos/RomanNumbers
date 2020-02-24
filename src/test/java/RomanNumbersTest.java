import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest {
    RomanNumber number = new RomanNumber();

    @Test
    public void testPredefinedResult1To5() {
        assertThat(number.calculate(1), equalTo("I"));
        assertThat(number.calculate(2), equalTo("II"));
        assertThat(number.calculate(3), equalTo("III"));
        assertThat(number.calculate(4), equalTo("IV"));
        assertThat(number.calculate(5), equalTo("V"));
    }

    @Test
    public void testPredefinedResult6To10() {
        assertThat(number.calculate(6), equalTo("VI"));
        assertThat(number.calculate(7), equalTo("VII"));
        assertThat(number.calculate(8), equalTo("VIII"));
        assertThat(number.calculate(9), equalTo("IX"));
        assertThat(number.calculate(10), equalTo("X"));
    }

    @Test
    public void testPredefinedResult11To15() {
        assertThat(number.calculate(11), equalTo("XI"));
        assertThat(number.calculate(12), equalTo("XII"));
        assertThat(number.calculate(14), equalTo("XIV"));
        assertThat(number.calculate(15), equalTo("XV"));
    }

    @Test
    public void testPredefinedResult16To20() {
        assertThat(number.calculate(16), equalTo("XVI"));
        assertThat(number.calculate(17), equalTo("XVII"));
        assertThat(number.calculate(19), equalTo("XIX"));
        assertThat(number.calculate(20), equalTo("XX"));
    }

    @Test
    public void testPredefinedResult30To50() {
        assertThat(number.calculate(38), equalTo("XXXVIII"));
        assertThat(number.calculate(40), equalTo("XL"));
        assertThat(number.calculate(42), equalTo("XLII"));
        assertThat(number.calculate(46), equalTo("XLVI"));
    }

    @Test
    public void testPredefinedResult50s() {
        assertThat(number.calculate(50), equalTo("L"));
    }

    @Test
    public void testPredefinedResult80s() {
        assertThat(number.calculate(80), equalTo("LXXX"));
        assertThat(number.calculate(86), equalTo("LXXXVI"));
    }

    @Test
    public void testPredefinedResult90s() {
        assertThat(number.calculate(90), equalTo("XC"));
        assertThat(number.calculate(91), equalTo("XCI"));
        assertThat(number.calculate(98), equalTo("XCVIII"));
    }

    @Test
    public void testPredefinedResult100s() {
        assertThat(number.calculate(100), equalTo("C"));
        assertThat(number.calculate(101), equalTo("CI"));
    }

    @Test
    public void testPredefinedResult300s() {
        assertThat(number.calculate(387), equalTo("CCCLXXXVII"));
    }

    @Test
    public void testPredefinedResult400s() {
        assertThat(number.calculate(400), equalTo("CD"));
        assertThat(number.calculate(401), equalTo("CDI"));
        assertThat(number.calculate(439), equalTo("CDXXXIX"));
    }

    @Test
    public void testPredefinedResult500s() {
        assertThat(number.calculate(500), equalTo("D"));
        assertThat(number.calculate(501), equalTo("DI"));
        assertThat(number.calculate(539), equalTo("DXXXIX"));
        assertThat(number.calculate(599), equalTo("DXCIX"));
    }

    @Test
    public void testPredefinedResult900s() {
        assertThat(number.calculate(900), equalTo("CM"));
        assertThat(number.calculate(918), equalTo("CMXVIII"));
        assertThat(number.calculate(994), equalTo("CMXCIV"));
    }

    @Test
    public void testPredefinedResult1000s() {
        assertThat(number.calculate(1000), equalTo("M"));
        assertThat(number.calculate(1001), equalTo("MI"));
        assertThat(number.calculate(1366), equalTo("MCCCLXVI"));
    }

    @Test
    public void testPredefinedResult2000s() {
        assertThat(number.calculate(2020), equalTo("MMXX"));
    }
}
