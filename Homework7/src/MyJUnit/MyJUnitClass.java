package MyJUnit;

import MyJUnit.annotation.AfterSuite;
import MyJUnit.annotation.BeforeSuite;
import MyJUnit.annotation.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyJUnitClass {

    public static void start(Class testClass) {
        Method[] methods = testClass.getDeclaredMethods();

        int countBS = 0, countAS = 0;
        List<Method> testMethods = new ArrayList<>();
        Method methodBeforeSuite = null;
        Method methodAfterSuite = null;

        for (Method method : methods) {
            if (method.getDeclaredAnnotations()[0] instanceof Test) {
                testMethods.add(method);
            }
            if (method.getDeclaredAnnotations()[0] instanceof BeforeSuite) {
                countBS++;
                methodBeforeSuite = method;
            }
            if (method.getDeclaredAnnotations()[0] instanceof AfterSuite) {
                countAS++;
                methodAfterSuite = method;
            }
        }

        if (countAS!=1 || countBS!=1) {
            throw new RuntimeException("expected BeforeSuite and AfterSuite annotation in ONE copy !");
        }

        Collections.sort(testMethods, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                return o2.getAnnotation(Test.class).priority() - o1.getAnnotation(Test.class).priority();
            }
        });

        Object instance = null;
        try {
            instance = testClass.getConstructor().newInstance();
            methodBeforeSuite.invoke(instance);
            for (Method testMethod : testMethods) {
                testMethod.invoke(instance);
            }
            methodAfterSuite.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
