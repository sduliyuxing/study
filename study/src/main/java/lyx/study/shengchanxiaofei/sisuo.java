package lyx.study.shengchanxiaofei;

/**
 * @Title sisuo
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:50
 */
public class sisuo{

    private static String a="aaa";
    private static String b="bbb";

    public static void main(String[] args) {

        Thread p1=new Thread(new lock1(),"�߳�1");
        Thread p2=new Thread(new lock2(),"�߳�2");

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
                        System.out.println(Thread.currentThread().getName()+"��ס"+a);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName()+"��ס"+b);
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
                        System.out.println(Thread.currentThread().getName()+"��ס"+b);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println(Thread.currentThread().getName()+"��ס"+a);
                    }
                }
            }
        }
    }
}
