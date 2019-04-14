package lyx.study.xianchengchi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Title pool
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\22 0022 16:45
 */
public class pool {

    private static mythread mythread=new mythread();

    private static ExecutorService pool1=Executors.newSingleThreadExecutor();
    private static ExecutorService pool2=Executors.newFixedThreadPool(3);
    private static ExecutorService pool3=Executors.newCachedThreadPool();

    private static Thread p1=new Thread(mythread,"线程1");
    private static Thread p2=new Thread(mythread,"线程2");
    private static Thread p3=new Thread(mythread,"线程3");
    private static Thread p4=new Thread(mythread,"线程4");

    public static void newsingle(){    //单线程 线程池

        pool1.execute(p1);
        pool1.execute(p2);
        pool1.execute(p3);
        pool1.execute(p4);

        pool1.shutdown();
//        pool1.execute(p2);
//        pool1.shutdown();
    }

    public static void fixed(){   //固定大小线程池
        pool2.execute(p1);
        pool2.execute(p2);
        pool2.execute(p3);
        pool2.execute(p4);

        pool2.shutdown();
    }

    public static void cache(){    //     无限大小线程池
        pool3.execute(p1);
        pool3.execute(p2);
        pool3.execute(p3);
        pool3.execute(p4);

        pool3.shutdown();
    }

}
