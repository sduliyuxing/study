package lyx.study.shengchanxiaofei;

/**
 * @Title resource
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\23 0023 8:49
 */
public class resource {

    private static int num=0;
    private static int size=10;

    public synchronized void remove() throws InterruptedException {
        if (num>0){
            num--;
            System.out.println(Thread.currentThread().getName()+"���ѣ�ʣ��"+num+"��");
            notifyAll();
        }else {
            wait();
            System.out.println(Thread.currentThread().getName()+"�ȴ�");
        }
    }

    public synchronized void add(){
        if (num<size){
            num++;
            System.out.println(Thread.currentThread().getName()+"������ʣ��"+num+"��");
            notifyAll();
        }else {
            System.out.println(Thread.currentThread().getName()+"�ȴ�");
        }
    }
}
