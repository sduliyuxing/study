package lyx.study.shengchanzhexiaofeizhe2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Title resource
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\29 0029 17:13
 */
public class resource {

    private Integer full;
    private Integer i=0;
    private BlockingQueue<Integer> queue=null;

    public resource(Integer full) {
        this.full = full;
        this.queue = new ArrayBlockingQueue(full);
    }

    public void put() throws InterruptedException {
        queue.put(i);
        i++;
        System.out.println(Thread.currentThread().getName()+"������ʣ��"+i);
    }

    public void get() throws InterruptedException{
        queue.take();
        i--;
        System.out.println(Thread.currentThread().getName()+"���ѣ�ʣ��"+i);
    }
}
