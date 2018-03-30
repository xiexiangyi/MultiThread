package org.xie.t;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class MyService {
    public static AtomicLong aiRef=new AtomicLong();

  synchronized   public void addNum() {
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是"+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
