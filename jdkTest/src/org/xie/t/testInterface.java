package org.xie.t;

import java.io.Serializable;
import java.util.List;

/**
 * @author xiexiangyi
 * @date 2018/3/7
 */


public interface testInterface<T, ID extends Serializable> {
        void  saveOrUpdate(T t);
        T get(ID id);
       List<T> query(String queryString);



}
