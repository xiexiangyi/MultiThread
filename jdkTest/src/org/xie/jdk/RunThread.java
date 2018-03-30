package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/3/7
 */


public class RunThread extends Thread {
    private boolean isRunning=true;

    public RunThread() {
        this.isRunning = isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("进入run 了");
        while (isRunning == true) {

        }
        System.out.println("线程被停止");
    }
}
