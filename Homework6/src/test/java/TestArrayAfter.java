import org.junit.Assert;
import org.junit.Test;

public class TestArrayAfter {
    @Test
    public void test1ArrayAfter() {
        int[] in = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected = {1, 7};
        int[] actual = MainClass.arrayAfter(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2ArrayAfter() {
        int[] in = {4, 4, 2, 3, 4, 1, 7, 5, 1};
        int[] expected = {1, 7, 5, 1};
        int[] actual = MainClass.arrayAfter(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3ArrayAfter() {
        int[] in = {1, 2, 4, 4};
        int[] expected = {};
        int[] actual = MainClass.arrayAfter(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void test4ArrayAfter() {
        int[] in = {7, 5, 1};
        MainClass.arrayAfter(in);
    }

}
