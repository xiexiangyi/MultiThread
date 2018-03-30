package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class Task {
//    private String getDetal;
//    private String getDeta2;
//
//    synchronized public void doLongTimeTask() {
////        try {
////            System.out.println("begin task");
////
////            Thread.sleep(2000);
////           String  t1="长时间处理任务从远端返回的值1 threadName="+Thread.currentThread().getName();
////            String  t2="长时间处理任务从远端返回的值2 threadName="+Thread.currentThread().getName();
////            synchronized (this){
////                getDetal=t1;
////                getDeta2=t2;
////            }
////            System.out.println(getDetal);
////            System.out.println(getDeta2);
////            System.out.println("end task");
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));
//
//        }
//        System.out.println("");
//        synchronized (this){
//            for (int i = 0; i < 100; i++) {
//            System.out.println("synchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));
//
//            }
//        }
//    }

   synchronized public void otherMethod() {
        System.out.println("---------------------------run---otherMethod");

    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));

            }
        }
    }

}
