package org.xie.Three;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class Test {

    public static void main(String[] args) {
        try {
            MyList service=new MyList();
            MyThreadA a=new MyThreadA(service);
            a.setName("A");
            a.start();
//            MyThreadA.sleep(3000);
            MyThreadB b=new MyThreadB(service);
            b.setName("B");
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
