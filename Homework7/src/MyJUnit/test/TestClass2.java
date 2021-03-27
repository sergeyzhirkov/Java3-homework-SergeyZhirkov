package MyJUnit.test;

import MyJUnit.annotation.AfterSuite;
import MyJUnit.annotation.BeforeSuite;
import MyJUnit.annotation.Test;

public class TestClass2 {
    @Test(priority = 10)
    public void test1() {
        System.out.println("test #1 priority = 10");
    }

    @Test(priority = 9)
    public void test2() {
        System.out.println("test #2 priority = 9");
    }

    @Test(priority = 8)
    public void test3() {
        System.out.println("test #3 priority = 8");
    }

    @Test(priority = 7)
    public void test4() {
        System.out.println("test #4 priority = 7");
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
