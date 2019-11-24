package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
        int b = hw.Method3(4, 0, -3);
        int c = hw.Method3(5, 0, -2);
    	int d = hw.Method3(6, 0, -3);
        int e = hw.Method3(6, 1, 1);
        int f = hw.Method3(4, -1, -1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,0,0,0,0);
        int b = hw.Method4(1,1,1,1,0);
        int c = hw.Method4(1,1,1,2,0);
        int d = hw.Method4(5,2,1,1,0);
        int e = hw.Method4(7,6,1,1,0);
        int f = hw.Method4(5,6,1,2,0);
    }
    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(0);
        assertEquals(false, a);
        boolean b = hw.bug(5);
        assertEquals(true, b);
    }
    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(0,0,0);
        assertEquals(false, a);
        boolean b = hw.isTriangle(1,0,0);
        assertEquals(false, b);
        boolean c = hw.isTriangle(1,1,0);
        assertEquals(false, c);
        boolean d = hw.isTriangle(1,1,2);
        assertEquals(false, d);
        boolean e = hw.isTriangle(1,2,1);
        assertEquals(false, e);
        boolean f = hw.isTriangle(2,1,1);
        assertEquals(false, f);
        boolean g = hw.isTriangle(3,4,5);
        assertEquals(true, g);
    }
    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(2019,1,31);
        assertEquals(true, a);
        boolean a1 = hw.isBirthday(2019,1,32);
        assertEquals(false, a1);
        boolean b = hw.isBirthday(2019,4,30);
        assertEquals(true, b);
        boolean b1 = hw.isBirthday(2019,4,32);
        assertEquals(false, b1);
        boolean c = hw.isBirthday(2019,2,28);
        assertEquals(true, c);
        boolean c1 = hw.isBirthday(2019,2,32);
        assertEquals(false, c1);
        boolean d = hw.isBirthday(2019,12,1);
        assertEquals(false, d);
        boolean e = hw.isBirthday(2018,1,31);
        assertEquals(true, e);
        boolean e1 = hw.isBirthday(2018,1,32);
        assertEquals(false, e1);
        boolean f = hw.isBirthday(2018,4,30);
        assertEquals(true, f);
        boolean f1 = hw.isBirthday(2018,4,32);
        assertEquals(false, f1);
        boolean g = hw.isBirthday(2018,2,28);
        assertEquals(true, g);
        boolean g1 = hw.isBirthday(2018,2,32);
        assertEquals(false, g1);
        boolean h = hw.isBirthday(2018,22,28);
        assertEquals(false, h);
        boolean i = hw.isBirthday(2016,3,31);
        assertEquals(true, i);
        boolean i1 = hw.isBirthday(2016,3,32);
        assertEquals(false, i1);
        boolean j = hw.isBirthday(2016,6,30);
        assertEquals(true, j);
        boolean j1 = hw.isBirthday(2016,6,32);
        assertEquals(false, j1);
        boolean k = hw.isBirthday(2016,2,29);
        assertEquals(true, k);
        boolean k1 = hw.isBirthday(2016,2,32);
        assertEquals(false, k1);
        boolean l = hw.isBirthday(2016,22,29);
        assertEquals(false, l);
        boolean m = hw.isBirthday(2020,2,29);
        assertEquals(false, m);
        boolean n = hw.isBirthday(1980,2,29);
        assertEquals(false, n);
    }
    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1,2,'+');
        assertEquals(3.0, a, 0);
        double b = hw.miniCalculator(1,2,'-');
        assertEquals(-1.0, b, 0);
        double c = hw.miniCalculator(1,2,'*');
        assertEquals(2.0, c, 0);
        double d = hw.miniCalculator(1,2,'/');
        assertEquals(0.5, d, 0);
        double e = hw.miniCalculator(1,2,'0');
        assertEquals(0.0, e, 0);
    }
    
}
