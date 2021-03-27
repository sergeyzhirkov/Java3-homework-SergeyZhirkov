package MyJUnit.test;

import MyJUnit.annotation.AfterSuite;
import MyJUnit.annotation.BeforeSuite;
import MyJUnit.annotation.Test;

public class TestClass3 {


    @Test(priority = 3)
    public void test1() {
        System.out.println("test #1 priority = 3");
    }

    @BeforeSuite
    public void test2() {
        System.out.println("test before");
    }

    @BeforeSuite
    public void testSecondBefore() {
        System.out.println("test before");
    }

    @AfterSuite
    public void testAfter() {
        System.out.println("test after");
    }
}
