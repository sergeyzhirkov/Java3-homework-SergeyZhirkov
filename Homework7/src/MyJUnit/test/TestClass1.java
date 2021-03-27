package MyJUnit.test;

import MyJUnit.annotation.AfterSuite;
import MyJUnit.annotation.BeforeSuite;
import MyJUnit.annotation.Test;

public class TestClass1 {

    @Test(priority = 3)
    public void test1() {
        System.out.println("test #1 priority = 3");
    }

    @Test(priority = 5)
    public void test2() {
        System.out.println("test #2 priority = 5");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("test #3 priority = 1");
    }

    @Test(priority = 3)
    public void test4() {
        System.out.println("test #4 priority = 3");
    }

    @BeforeSuite
    public void test5() {
        System.out.println("test before");
    }

    @AfterSuite
    public void test6() {
        System.out.println("test after");
    }
}
