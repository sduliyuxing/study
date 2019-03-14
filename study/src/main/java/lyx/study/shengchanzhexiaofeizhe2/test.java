package lyx.study.shengchanzhexiaofeizhe2;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\29 0029 17:25
 */
public class test {

    public static void main(String[] args) throws InterruptedException {
        resource resource=new resource(10);
        produce produce=new produce(resource);
        consumer consumer=new consumer(resource);

        Thread p1=new Thread(produce,"生产者1");
        Thread p2=new Thread(produce,"生产者2");
        Thread p3=new Thread(produce,"生产者3");
        Thread p4=new Thread(consumer,"消费者1");
        Thread p5=new Thread(consumer,"消费者2");
        Thread p6=new Thread(consumer,"消费者3");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
//        p6.start();
    }
}
