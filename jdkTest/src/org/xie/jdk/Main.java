package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class Main {
//    public    int i=10;
//    synchronized public void operateIMainMethod(){
//        try {
//            i--;
//            System.out.println("main print i="+i);
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步 sleep begin threadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("int main 下一步 sleep end threadName=" + Thread.currentThread().getName() + "time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
