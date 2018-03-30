package org.xie.Three;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 */


public class Test1 {
    public static void main(String[] args) {
        try {
            String newString=new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
