package lyx.study.shengchanxiaofei;

/**
 * @Title resource
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\23 0023 8:49
 */
public class resource {

    private static int num=0;
    private static int size=10;

    public synchronized void remove() throws InterruptedException {
        if (num>0){
            num--;
            System.out.println(Thread.currentThread().getName()+"消费，剩余"+num+"个");
            notifyAll();
        }else {
            wait();
            System.out.println(Thread.currentThread().getName()+"等待");
        }
    }

    public synchronized void add(){
        if (num<size){
            num++;
            System.out.println(Thread.currentThread().getName()+"生产，剩余"+num+"个");
            notifyAll();
        }else {
            System.out.println(Thread.currentThread().getName()+"等待");
        }
    }
}
