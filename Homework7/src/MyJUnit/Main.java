package MyJUnit;

import MyJUnit.test.TestClass1;
import MyJUnit.test.TestClass2;
import MyJUnit.test.TestClass3;

public class Main {
    public static void main(String[] args) {
        MyJUnitClass.start(TestClass1.class);
        MyJUnitClass.start(TestClass2.class);
        MyJUnitClass.start(TestClass3.class);
    }
}
