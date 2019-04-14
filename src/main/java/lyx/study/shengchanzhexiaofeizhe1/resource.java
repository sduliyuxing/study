package lyx.study.shengchanzhexiaofeizhe1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Title resource
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
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
        System.out.println(Thread.currentThread().getName()+"�����߼���");
        while (empty==full){
            System.out.println("��������");
            shengchangzhe.await();
        }
        empty++;
        System.out.println(Thread.currentThread().getName()+"��������"+empty+"��");
        xiaofeizhe.signalAll();
        System.out.println(Thread.currentThread().getName()+"�����߽���");
        System.out.println();
        lock.unlock();
    }

    public void get() throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"�����߼���");
        while (empty==0){
            System.out.println("����Ϊ��");
            xiaofeizhe.await();
        }
        empty--;
        System.out.println(Thread.currentThread().getName()+"���ѣ���"+empty+"��");
        xiaofeizhe.signalAll();
        System.out.println(Thread.currentThread().getName()+"�����߽���");
        System.out.println();
        lock.unlock();
    }
}
