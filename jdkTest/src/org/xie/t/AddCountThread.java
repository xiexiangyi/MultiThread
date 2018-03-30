package org.xie.t;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 * 使用原子类进行i++操作
 */


public class AddCountThread extends Thread {
    private AtomicInteger count=new AtomicInteger(0);

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
