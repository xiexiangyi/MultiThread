package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/12
 */


public class MyObject {
//    private String username="1";
//    private String password = "11";
//    public void setValue(String u,String p) {
//        this.username=u;
//        if (Thread.currentThread().getName().equals("a")) {
//            System.out.println("停止a线程");
//            Thread.currentThread().suspend();
//        }
//        this.password=p;
//
//    }
//    public void ptintUsernamePassword() {
//        System.out.println(username+""+password);
//    }

   synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void methodB(){
        try {
            System.out.println("begin methodB threadName="+Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    synchronized public void speedPrintString() {
        System.out.println("speedPrintString  ____getLock time=" + System.currentTimeMillis() + "run threadName=" + Thread.currentThread().getName());
        System.out.println("--------------------");
        System.out.println("speedPrintString  releaseLock time=" + System.currentTimeMillis() + "run threadName=" + Thread.currentThread().getName());

    }
}
