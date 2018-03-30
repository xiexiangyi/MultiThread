package org.xie.jdk;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @author xiexiangyi
 * @date 2018/1/10
 */


public class CloneTest {
    public static void main(String[] args) {
        User person=new User(12,"XIE");
        System.out.println(System.currentTimeMillis());
        System.out.println(person.getAge());
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });     pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });     pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });
        pool.execute(new RecursiveAction() {
            @Override
            protected void compute() {
                User clone = null;
                try {
                    clone = person.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(clone.getAge());
            }
        });




        System.out.println(System.currentTimeMillis());
    }


   public static   void test222(){

    }
}
