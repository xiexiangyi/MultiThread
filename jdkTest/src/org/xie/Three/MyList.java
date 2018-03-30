package org.xie.Three;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiexiangyi
 * @date 2018/3/8
 * 使用sleep（）结合while（true）死循环实现多个线程间通信
 */


public class MyList {
    private List list=new ArrayList();
    public void add() {
        list.add("高红燕");

    }

    public int size() {
        return list.size();
    }

}
