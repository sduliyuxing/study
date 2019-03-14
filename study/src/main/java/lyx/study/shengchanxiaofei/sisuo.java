package lyx.study.shengchanxiaofei;

/**
 * @Title sisuo
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:50
 */
public class sisuo{

    private static String a="aaa";
    private static String b="bbb";

    public static void main(String[] args) {

        Thread p1=new Thread(new lock1(),"线程1");
        Thread p2=new Thread(new lock2(),"线程2");

        p1.start();
        p2.start();
    }

    public static class lock1 implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (a){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"锁住"+a);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName()+"锁住"+b);
                    }
                }
            }
        }
    }
    public static class lock2 implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (b){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"锁住"+b);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println(Thread.currentThread().getName()+"锁住"+a);
                    }
                }
            }
        }
    }
}
