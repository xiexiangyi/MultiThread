package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/13
 */


public class MyThreadB extends Thread {
    private MyList list;

    public MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
          list.add("threadB"+(i+1));

        }
    }
}
