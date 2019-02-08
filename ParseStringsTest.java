 

import org.junit.Test;

/**
 * @author leon on 10/01/2019.
 */
public class ParseStringsTest {
    @Test
    public void test1() {
        test("123", new String[]{"1","2","3"});
    }

    @Test
    public void test2() {
        test(" 23", new String[]{" ", "2","3"});
    }

    @Test
    public void test3() {
        test("   ", new String[]{" ", " ", " "});
    }

    @Test
    public void test4() {
        test(null, null);
    }

    private void test(String input, String[] expected) {
        String[] actual = StringParser.parseStrings(input);
        TestUtils.assertArrayEquals(expected, actual);
    }
}
