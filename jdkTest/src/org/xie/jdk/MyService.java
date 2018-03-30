package org.xie.jdk;

/**
 * @author xiexiangyi
 * @date 2018/2/13
 */


public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data) {
        try {
            if (list.getSize()<1) {
                Thread.sleep(2000);
                list.add(data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
