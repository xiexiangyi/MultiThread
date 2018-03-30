package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class Service {
//    synchronized public  void service1(){
//        System.out.println("service1");
//        service2();
//    }
//    synchronized public  void service2(){
//        System.out.println("service2");
//        service3();
//    }
//    synchronized public  void service3(){
//        System.out.println("service3");
//    }
//
//    synchronized public void testMethod() {
//        if (Thread.currentThread().getName().equals("a")) {
//            System.out.println("ThreadName=" + Thread.currentThread().getName() + "run beginTime=" + System.currentTimeMillis());
//            int i = 1;
//            while (i == 1) {
//                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
//                    System.out.println("ThreadName=" + Thread.currentThread().getName() + "run exceptionTime=" + System.currentTimeMillis());
//                    Integer.parseInt("a");
//                }
//            }
//        } else {
//            System.out.println("ThreadB run Time="+System.currentTimeMillis());
//        }
//    }

//    private String usernameParam;
//    private String passwordParam;
//    private String anyString=new String();
//    public void setUsernamePassword(String username, String password) {
//        try {
//            synchronized (anyString) {
//                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步代码块");
//                usernameParam=username;
//                Thread.sleep(1000);
//                passwordParam=password;
//                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步代码块");
//
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void testMethod1(MyObject object){
        synchronized (object) {
            try {
                System.out.println("testMethod1____getLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis() + "run ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {

            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
    }

    synchronized public  void printC() {

        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printC");
    }
}
