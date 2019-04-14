package lyx.study.xunhuandayin;

/**
 * @Title dayin_join
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\3\8 0008 11:48
 */
public class dayin_join {

    static int i=1;
    public static class threada implements Runnable{
        @Override
        public void run() {
            System.out.println("a--"+"A"+i);
            i++;
        }
    }
    public static class threadb implements Runnable{
        @Override
        public void run() {
            System.out.println("b--"+"B"+i);
            i++;
        }
    }
    public static class threadc implements Runnable{
        @Override
        public void run() {
            System.out.println("c--"+"C"+i);
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread a=new Thread(new threada());
            a.start();
            a.join();
            Thread b=new Thread(new threadb());
            b.start();
            b.join();
            Thread c=new Thread(new threadc());
            c.start();
            c.join();
        }

    }
}
