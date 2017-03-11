import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Float.NaN;
import static org.junit.Assert.*;

public class GCDTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTwoIntConstructor() {
        GCD gcd = new GCD(1, 2);
    }

    @Test
    public void testCalculateMethodExists() {
        GCD gcd = new GCD(1, 2);
        gcd.calculate();
    }

    @Test
    public void testCalculateMethodReturnsFloat() {
        GCD gcd = new GCD(1, 2);
        float value = gcd.calculate();
    }

    @Test
    public void testNegativeIntegersReturnNaNFirstNegativeInteger() throws Exception {
        GCD gcd = new GCD(-1, 2);
        float value = gcd.calculate();
        assertEquals(NaN, value, 0);
    }

    @Test
    public void testNegativeIntegersReturnNaNSecondNegativeInteger() throws Exception {
        GCD gcd = new GCD(1, -2);
        float value = gcd.calculate();
        assertEquals(NaN, value, 0);
    }

    @Test
    public void testNegativeIntegersReturnNaNBothNegativeInteger() throws Exception {
        GCD gcd = new GCD(-1, -2);
        float value = gcd.calculate();
        assertEquals(NaN, value, 0);
    }

}