package org.xie.t;

import org.junit.Test;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class Run {
    public static void main(String[] args) {
        AddCountThread countThread=new AddCountThread();
        Thread thread1=new Thread(countThread);
        thread1.start();

        Thread thread2=new Thread(countThread);
        thread2.start();

        Thread thread3=new Thread(countThread);
        thread3.start();

        Thread thread4=new Thread(countThread);
        thread4.start();

        Thread thread5=new Thread(countThread);
        thread5.start();
    }
    @Test
    public void test1() {
        try {
            MyService service=new MyService();
            MyThread [] array=new MyThread[5];
            for (int i = 0; i < array.length; i++) {
              array[i]=new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(5000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
