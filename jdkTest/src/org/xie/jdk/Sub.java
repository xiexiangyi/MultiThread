package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */



public class Sub extends Main {
//    synchronized public void operateISubMethod() {
//        try {
//            while (i > 0) {
//                i--;
//                System.out.println("sub print i="+i);
//                Thread.sleep(1000);
//                this.operateIMainMethod();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public synchronized   void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("int sub 下一步 sleep end threadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
