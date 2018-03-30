package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class MyThread1 extends Thread{
//    private Task task;
//
//    public MyThread1(Task task) {
//        this.task = task;
//    }
//
//    @Override
//    public void run() {
////        super.run();
////        System.out.println("MyThread1 run priroty="+this.getPriority());
////        MyThread2 thread2=new MyThread2();
////        thread2.start();
////        long beginTime=System.currentTimeMillis();
////        long addResult=0;
////        for (int j=0;j<10;j++) {
////            for (int i=0;i<50000;i++) {
////                Random random=new Random();
////                random.nextInt();
////                addResult+=i;
////            }
////        }
////        long endTime=System.currentTimeMillis();
////        System.out.println("####thread1 use time="+(endTime-beginTime));
////
////    }
////        CommonUtils.beginTime1=System.currentTimeMillis();
//        task.doLongTimeTask();
////        CommonUtils.endTime1=System.currentTimeMillis();
//
//    }
    private MyOneList list;

    public MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService myService=new MyService();
        myService.addServiceMethod(list,"A");
    }
}
