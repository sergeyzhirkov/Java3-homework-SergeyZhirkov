import org.junit.Assert;
import org.junit.Test;

public class TestArrayContains {
    @Test
    public void test1ArrayContains() {
        int[] in = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertTrue(MainClass.arrayContains(in));
    }

    @Test
    public void test2ArrayContains() {
        int[] in = {1, 1, 1, 4, 3, 1, 4, 4};
        Assert.assertFalse(MainClass.arrayContains(in));
    }

    @Test
    public void test3ArrayContains() {
        int[] in = {3, 4, 5};
        Assert.assertFalse(MainClass.arrayContains(in));
    }
}
