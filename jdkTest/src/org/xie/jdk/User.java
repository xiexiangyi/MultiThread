package org.xie.jdk;

import java.io.Serializable;

/*
created by xiexiangyi 2017/11/20
*/
public class User implements Cloneable,Serializable{
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
