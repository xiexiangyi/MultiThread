package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/11
 */


public class ThreadB extends Thread {
//    private HasSelfPrivateNum numRef;
//
//    public ThreadB(HasSelfPrivateNum numRef) {
//        super();
//      this.numRef=numRef;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        numRef.addI("b");
//    }
//
//    private Service service;
//
//    public ThreadB(Service service) {
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
//    public ThreadB(Sub sub) {
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
//    public ThreadB(Service service) {
//        this.service = service;
//    }
//
//    @Override
//    public void run() {
//        super.run();
//        service.setUsernamePassword("b","bb");
//    }


    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}
