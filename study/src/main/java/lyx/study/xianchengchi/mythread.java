package lyx.study.xianchengchi;

/**
 * @Title mythread
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\22 0022 16:47
 */
public class mythread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行");
    }
}
