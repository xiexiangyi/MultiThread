package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class ObjectService {
    public void serviceMethodA() {
        synchronized (this) {
            try {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A begin time=" + System.currentTimeMillis());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("b begin time=" + System.currentTimeMillis());
            System.out.println("B begin time=" + System.currentTimeMillis());
        }
    }
}
