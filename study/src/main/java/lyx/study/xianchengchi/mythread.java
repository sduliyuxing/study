package lyx.study.xianchengchi;

/**
 * @Title mythread
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\22 0022 16:47
 */
public class mythread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"ִ��");
    }
}
