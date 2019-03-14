package lyx.study.xianchengchi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Title pool
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\22 0022 16:45
 */
public class pool {

    private static mythread mythread=new mythread();

    private static ExecutorService pool1=Executors.newSingleThreadExecutor();
    private static ExecutorService pool2=Executors.newFixedThreadPool(3);
    private static ExecutorService pool3=Executors.newCachedThreadPool();

    private static Thread p1=new Thread(mythread,"�߳�1");
    private static Thread p2=new Thread(mythread,"�߳�2");
    private static Thread p3=new Thread(mythread,"�߳�3");
    private static Thread p4=new Thread(mythread,"�߳�4");

    public static void newsingle(){    //���߳� �̳߳�

        pool1.execute(p1);
        pool1.execute(p2);
        pool1.execute(p3);
        pool1.execute(p4);

        pool1.shutdown();
//        pool1.execute(p2);
//        pool1.shutdown();
    }

    public static void fixed(){   //�̶���С�̳߳�
        pool2.execute(p1);
        pool2.execute(p2);
        pool2.execute(p3);
        pool2.execute(p4);

        pool2.shutdown();
    }

    public static void cache(){    //     ���޴�С�̳߳�
        pool3.execute(p1);
        pool3.execute(p2);
        pool3.execute(p3);
        pool3.execute(p4);

        pool3.shutdown();
    }

}
