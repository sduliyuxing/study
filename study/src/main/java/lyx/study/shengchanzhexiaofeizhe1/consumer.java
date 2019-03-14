package lyx.study.shengchanzhexiaofeizhe1;

/**
 * @Title consumer
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\28 0028 15:56
 */
public class consumer implements Runnable {

    private resource resource;

    public consumer(resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(1000);
               resource.get();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
