package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class MyThread2 extends Thread{
//    private Task task;
//
//    public MyThread2(Task task) {
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
////        CommonUtils.beginTime2=System.currentTimeMillis();
//        task.otherMethod();
////        CommonUtils.endTime2=System.currentTimeMillis();
//
//    }
//    @Override
//    public void run() {
////        super.run();
////        System.out.println("MyThread2 run priroty="+this.getPriority());
//
//        long beginTime=System.currentTimeMillis();
//        long addResult=0;
//        for (int j=0;j<10;j++) {
//            for (int i=0;i<50000;i++) {
//                Random random=new Random();
//                random.nextInt();
//                addResult+=i;
//            }
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println("####thread2 use time="+(endTime-beginTime));
//
//    }

    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService myService=new MyService();
        myService.addServiceMethod(list,"B");
    }
}
