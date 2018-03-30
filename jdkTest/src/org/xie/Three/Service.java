package org.xie.Three;

import org.junit.Test;
import sun.util.calendar.Gregorian;

import java.util.Calendar;
import java.util.Date;

/**
 * @author xiexiangyi
 * @date 2018/3/9
 */


public class Service {
    @Test
    public void testMethod() {
        Date time = Calendar.getInstance().getTime();

        System.out.println(time);
        
        System.out.println("cherry pick test");

    }
}
