package lyx.study.shengchanzhexiaofeizhe1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Title resource
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\28 0028 15:39
 */
public class resource {

    private Integer empty=0;
    private Integer full;
    private Lock lock=new ReentrantLock();
    private Condition shengchangzhe=lock.newCondition();
    private Condition xiaofeizhe=lock.newCondition();

    public resource(Integer full) {
        this.full = full;
    }

    public void put() throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"生产者加锁");
        while (empty==full){
            System.out.println("容量已满");
            shengchangzhe.await();
        }
        empty++;
        System.out.println(Thread.currentThread().getName()+"生产，共"+empty+"个");
        xiaofeizhe.signalAll();
        System.out.println(Thread.currentThread().getName()+"生产者解锁");
        System.out.println();
        lock.unlock();
    }

    public void get() throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"消费者加锁");
        while (empty==0){
            System.out.println("容量为空");
            xiaofeizhe.await();
        }
        empty--;
        System.out.println(Thread.currentThread().getName()+"消费，共"+empty+"个");
        xiaofeizhe.signalAll();
        System.out.println(Thread.currentThread().getName()+"消费者解锁");
        System.out.println();
        lock.unlock();
    }
}
