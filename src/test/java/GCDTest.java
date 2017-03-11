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

    @Test
    public void testZeroIntegerReturnZeroFirstZeroInteger() throws Exception {
        GCD gcd = new GCD(0, 1);
        float value = gcd.calculate();
        assertEquals(0, value, 0);
    }

    @Test
    public void testZeroIntegerReturnZeroSecondZeroInteger() throws Exception {
        GCD gcd = new GCD(1, 0);
        float value = gcd.calculate();
        assertEquals(0, value, 0);
    }

    @Test
    public void testZeroIntegerReturnZeroBothZeroInteger() throws Exception {
        GCD gcd = new GCD(0, 0);
        float value = gcd.calculate();
        assertEquals(0, value, 0);
    }

    @Test
    public void testOneReturnOneFirstOne() throws Exception {
        GCD gcd = new GCD(1, 2);
        float value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(1, 3);
        value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(1, 10);
        value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(1, 1000);
        value = gcd.calculate();
        assertEquals(1, value, 0);
    }

    @Test
    public void testOneReturnOneSecondOne() throws Exception {
        GCD gcd = new GCD(2, 1);
        float value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(3, 1);
        value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(10, 1);
        value = gcd.calculate();
        assertEquals(1, value, 0);

        gcd = new GCD(1000, 1);
        value = gcd.calculate();
        assertEquals(1, value, 0);
    }

    @Test
    public void testOneIntegerReturnOneBothOne() throws Exception {
        GCD gcd = new GCD(1, 1);
        float value = gcd.calculate();
        assertEquals(1, value, 0);
    }

    @Test
    public void testCalculateReturnsTheCorrectValueForTwoNonNegativeIntegers() throws Exception {
        GCD gcd = new GCD(13, 169);
        float value = gcd.calculate();
        assertEquals(13, value, 0);

        gcd = new GCD(169, 13);
        value = gcd.calculate();
        assertEquals(13, value, 0);

        gcd = new GCD(13, 13);
        value = gcd.calculate();
        assertEquals(13, value, 0);

        gcd = new GCD(6, 15);
        value = gcd.calculate();
        assertEquals(3, value, 0);

        gcd = new GCD(15, 6);
        value = gcd.calculate();
        assertEquals(3, value, 0);

        gcd = new GCD(8, 16);
        value = gcd.calculate();
        assertEquals(8, value, 0);

        gcd = new GCD(16, 8);
        value = gcd.calculate();
        assertEquals(8, value, 0);

        gcd = new GCD(42, 49);
        value = gcd.calculate();
        assertEquals(7, value, 0);

        gcd = new GCD(49, 42);
        value = gcd.calculate();
        assertEquals(7, value, 0);
    }

}