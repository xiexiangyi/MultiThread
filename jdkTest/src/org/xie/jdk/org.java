package org.xie.jdk;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java.util.stream.Stream;

/*
created by xiexiangyi 2017/10/18
*/
public class org {
    public static void main(String[] args) {
//        FunctionInterfaceImpl functionInterface = new FunctionInterfaceImpl();
//        Function<String, Integer> stringIntegerFunction = functionInterface::convert;
//        System.out.println(stringIntegerFunction.apply("123"));
//        List<User> users = new ArrayList<User>();
//        users.add(new User(24, "zhangsan"));
//        users.add(new User(22, "李四"));
//        users.add(new User(10, "王五"));
//        Stream<User> stream = users.stream();
//        stream.filter(((User p)->p.getAge()>20)).map((User user)->user.getName().toUpperCase()).forEach(s -> System.out.println(s));
//        Clock clock=Clock.systemDefaultZone();
//
//
//        Instant instant = clock.instant();
//        Date from = Date.from(instant);
//        System.out.println(from);
//        Date date=new Date();
//        long millis = clock.millis();
//         System.out.println(date.getTime());
//        System.out.println(millis);
//        System.out.println(date);
//        List<String> list = Arrays.asList("a", "b", "d", "c");
//        char [] arr=new char[]{'a', 'b', 'd', 'c'};
//     Arrays.parallelSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }



    }
    @Test
    public void test(){
        try {
           int [] arr={};
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
           }
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println(2);
    }
}
