package lyx.study.xunhuandayin;

import java.util.concurrent.Semaphore;

/**
 * @Title dayin_semaphore
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\3\8 0008 11:41
 */
public class dayin_semaphore {

    static Semaphore sa=new Semaphore(1);
    static Semaphore sb=new Semaphore(0);
    static Semaphore sc=new Semaphore(0);

    public static class threada implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                try {
                    sa.acquire();
                    System.out.println("a--"+"A"+i);
                    sb.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class threadb implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                try {
                    sb.acquire();
                    System.out.println("b--"+"B"+i);
                    sc.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class threadc implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                try {
                    sc.acquire();
                    System.out.println("c--"+"C"+i);
                    sa.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new threada()).start();
        new Thread(new threadb()).start();
        new Thread(new threadc()).start();
    }
}
