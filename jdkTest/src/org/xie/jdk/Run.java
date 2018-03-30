package org.xie.jdk;

import org.junit.Test;
import sun.dc.pr.PRError;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;


/**
 * @author xiexiangyi
 * @date 2018/2/11
 */


public class Run {



    @Test
    public void  test(){
        try {
            MyThread thread=new MyThread();

            System.out.println(System.currentTimeMillis());
            thread.start();
            thread.suspend();
//            thread.resume();
            Thread.sleep(100000);
            //A段
//            System.out.println(Thread.currentThread());
//            System.out.println(thread);
//            System.out.println(thread==Thread.currentThread());
//            thread.suspend();
//            thread.suspend();

//           thread.resume();
            System.out.println("A="+System.currentTimeMillis()+"i="+thread.getId());
            //B段
//            thread.resume();
//            Thread.sleep(5000);
            //C段
//            thread.suspend();


            System.out.println("B="+System.currentTimeMillis()+"i="+thread.getId());
//            Thread.sleep(5000);
            System.out.println("B="+System.currentTimeMillis()+"i="+thread.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            final SychronizedObject object=new SychronizedObject();
            Thread thread1=new Thread(){
                @Override
                public void run() {
                    super.run();
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2=new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread2启动了，但是进入不了printString()方法，只打印了一个begin");
                    System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2() {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end~=");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        try {
//            final MyObject myObject=new MyObject();
//            Thread thread1=new Thread(){
//                @Override
//                public void run() {
//                    super.run();
//                    myObject.setValue("a","aa");
//                }
//            };
//            thread1.setName("a");
//            thread1.start();
//            Thread.sleep(500);
//            Thread thread2=new Thread(){
//                @Override
//                public void run() {
//                    super.run();
//                    myObject.ptintUsernamePassword();
//                }
//            };
//            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//
//    @Test
//    public void test4() {
//        try {
//            System.out.println("main thread begin priroty="+Thread.currentThread().getPriority());
//            Thread.currentThread().setPriority(6);
//            System.out.println("main thread end priroty=" + Thread.currentThread().getPriority());
//            MyThread1 thread1=new MyThread1();
//            thread1.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void test5() {
//        try {
//            for (int i=0;i<5;i++) {
//                MyThread1 thread1=new MyThread1();
//                thread1.setPriority(10);
//                thread1.start();
//
//                MyThread2 thread2=new MyThread2();
//                thread2.setPriority(1);
//                thread2.start();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    @Test
    public  void test6() {

        try {
//            HasSelfPrivateNum numRef=new HasSelfPrivateNum();
//            ThreadA threadA=new ThreadA(numRef);
//            threadA.start();
//
//            ThreadB threadB=new ThreadB(numRef);
//            threadB.start();

//            MyObject object=new MyObject();
//            ThreadA a=new ThreadA(object);
//            a.setName("A");
//            ThreadB b=new ThreadB(object);
//            b.setName("B");
//            a.start();
//            b.start();
//            Thread.sleep(1000);
//            PublicVar publicVar=new PublicVar();
//            ThreadA thread=new ThreadA(publicVar);
//            thread.start();
////            Thread.sleep(20000);
//
//            publicVar.getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public  void test7() {

        try {
            MyThread t=new MyThread();
            t.start();
            Thread.sleep(10000);
//            Thread.currentThread().setPriority(1);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    @Test
//    public  void test8() {
//
//        try {
//          Service service=new Service();
//          ThreadA a=new ThreadA(service);
//            a.setName("a");
//            a.start();
//            Thread.sleep(2000);
//            ThreadB b=new ThreadB(service);
//            b.setName("b");
//            b.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//    @Test
//    public  void test8() {
//
//        try {
//            Sub sub=new Sub();
//         ThreadA a=new ThreadA(sub);
//            a.setName("A");
//            a.start();
//            ThreadB b=new ThreadB(sub);
//            b.setName("B");
//            b.start();
//            Thread.sleep(4000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    @Test
    public  void test9() {

//        try {
//           Task task=new Task();
//           MyThread1 thread1=new MyThread1(task);
//           thread1.start();
//           MyThread2 thread2=new MyThread2(task);
//           thread2.start();
//            Thread.sleep(10000);
////            long beginTime=CommonUtils.beginTime1;
////            if (CommonUtils.beginTime2<CommonUtils.beginTime1) {
////                beginTime=CommonUtils.beginTime2;
////            }
////            long endTime=CommonUtils.endTime1;
////            if (CommonUtils.endTime2>CommonUtils.beginTime1) {
////                endTime =CommonUtils.endTime2;
////            }
////            System.out.println(endTime-beginTime);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

//    @Test
//    public  void test10() {
//
//        try {
//            Service service=new Service();
//            MyObject object=new MyObject();
//            MyObject objec2t=new MyObject();
//            ThreadA  a=new ThreadA(service,object);
//            a.setName("A");
//            a.start();
//            ThreadB  B=new ThreadB(service,objec2t);
//            B.setName("B");
//            B.start();
//            Thread.sleep(8000);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    @Test
    public  void test11() {

        try {
            MyList list=new MyList();
            MyThreadA threadA=new MyThreadA(list);
            threadA.setName("A");
            threadA.start();
            MyThreadB threadB=new MyThreadB(list);
            threadB.setName("B");
            threadB.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public  void test12() {

        try {
           DeathThread t1=new DeathThread();
           t1.setFlag("a");
           Thread thread1=new Thread(t1);
           thread1.start();
           Thread.sleep(2000);
            t1.setFlag("b");
            Thread threadb=new Thread(t1);
            threadb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public  void test13() {

       PublicClass publicClass=new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge()+"  "+privateClass.getAddress());
    }

    @Test
    public  void test14() {
        try {
            PrintString printStringService=new PrintString();
            new Thread(printStringService).start();
            System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
            Thread.sleep(4000);
            printStringService.setContinuePrint(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void test15() {
        try {
           RunThread thread=new RunThread();
           thread.start();
//            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
