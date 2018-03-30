package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/11
 */


public class ThreadA extends Thread {
//    private HasSelfPrivateNum numRef;
//
//    public ThreadA(HasSelfPrivateNum numRef) {
//        super();
//      this.numRef=numRef;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        numRef.addI("a");
//    }

//    private MyObject object;
//
//    public ThreadA(MyObject object) {
//        this.object = object;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        object.methodA();
//    }
//    private PublicVar publicVar;
//
//    public ThreadA(PublicVar publicVar) {
//        this.publicVar = publicVar;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        publicVar.setValue("B","BB");
//    }
//    private Service service;
//
//    public ThreadA(Service service) {
//        this.service = service;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        service.testMethod();
//    }

//    private Sub sub;
//
//    public ThreadA(Sub sub) {
//        this.sub = sub;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        sub.serviceMethod();
//    }

//    private Service service;
//
//    public ThreadA(Service service) {
//        this.service = service;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        service.setUsernamePassword("a","aa");
//    }


    @Override
    public void run() {
        super.run();
       Service.printA();
    }
}
