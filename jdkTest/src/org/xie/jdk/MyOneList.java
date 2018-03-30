package org.xie.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiexiangyi
 * @date 2018/2/13
 */


public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data) {
        list.add(data);
    }
    synchronized public int getSize() {
        return list.size();
    }
}
