package com.pingan.taozi1;

import com.sun.org.glassfish.gmbal.AMXMetadata;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class DemoTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before test..");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method..");
    }

    @Test(dependsOnMethods = {"testSub"})
    public void testAdd() throws Exception{
        int res =new Demo().add(3,4);
        assertEquals(res,7);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSub() throws Exception{
        int res =new Demo().sub(3,4);
        assertEquals(res,-1);
//        int i =0;
//        while (1<3){
//            i++;
//        }
        throw new NullPointerException();
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("after method..");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class..");
    }
}