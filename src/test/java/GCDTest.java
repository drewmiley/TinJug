import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

}