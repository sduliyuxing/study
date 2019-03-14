package lyx.study.shengchanxiaofei;

/**
 * @Title main
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\23 0023 9:19
 */
public class main {
    public static void main(String[] args) {
        resource resource=new resource();
        produce p1=new produce(resource,"生产者1");
        produce p2=new produce(resource,"生产者2");
        produce p3=new produce(resource,"生产者3");
        consumer t1=new consumer(resource,"消费者1");
        consumer t2=new consumer(resource,"消费者2");
        consumer t3=new consumer(resource,"消费者3");
        p1.start();
        p2.start();
        p3.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
