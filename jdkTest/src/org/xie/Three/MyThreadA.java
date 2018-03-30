package org.xie.Three;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class MyThreadA extends Thread{
    private MyList myList;

    public MyThreadA(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <100; i++) {
                myList.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
