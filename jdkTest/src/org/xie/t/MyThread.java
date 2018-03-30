package org.xie.t;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
