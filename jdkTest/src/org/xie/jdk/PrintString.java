package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/3/7
 */


public class PrintString implements Runnable{
    private boolean isContinuePrint=true;

    public PrintString() {
        this.isContinuePrint = isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
