package lyx.study.xunhuandayin;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Title dayin_lock
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\2\12 0012 16:07
 */
public class dayin_lock {

    private static Integer state=0;
    private static Lock lock=new ReentrantLock();

    static class threada implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;){
                lock.lock();
                if (state%3==0){
                    System.out.println(Thread.currentThread().getName()+" :a "+i);
                    i++;
                    state++;
                }
                lock.unlock();
            }
        }
    }

    static class threadb implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;){
                lock.lock();
                if (state%3==1){
                    System.out.println(Thread.currentThread().getName()+" :b "+i);
                    i++;
                    state++;
                }
                lock.unlock();
            }
        }
    }

    static class threadc implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;){
                lock.lock();
                if (state%3==2){
                    System.out.println(Thread.currentThread().getName()+" :c "+i);
                    i++;
                    state++;
                }
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        threada a=new threada();
        threadb b=new threadb();
        threadc c=new threadc();
        new Thread(a,"线程A").start();
        new Thread(b,"线程B").start();
        new Thread(c,"线程C").start();
    }
}
