package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class SychronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
