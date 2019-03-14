package lyx.study.shengchanzhexiaofeizhe1;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\28 0028 15:58
 */
public class test {

    public static void main(String[] args) {

        resource resource = new resource(10);
        produce produce = new produce(resource);
        consumer consumer = new consumer(resource);

        Thread t1=new Thread(produce,"生产者1");
        Thread t2=new Thread(produce,"生产者2");
        Thread t3=new Thread(produce,"生产者3");
//
        Thread t4=new Thread(consumer,"消费者1");
        Thread t5=new Thread(consumer,"消费者2");
        Thread t6=new Thread(consumer,"消费者3");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
