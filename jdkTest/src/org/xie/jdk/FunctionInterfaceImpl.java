package org.xie.jdk;


/*
created by xiexiangyi 2017/11/20
*/
public class FunctionInterfaceImpl implements  FunctionInterfaceTest<String ,Integer> {
    @Override
    public Integer convert(String form) {

        return  Integer.valueOf(form);
    }
}
