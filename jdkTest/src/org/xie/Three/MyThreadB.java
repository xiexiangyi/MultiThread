package org.xie.Three;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class MyThreadB extends Thread{
    private MyList myList;

    public MyThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (myList.size()==5) {
                    System.out.println("==5了,线程b要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
