package lyx.study.shengchanzhexiaofeizhe2;

/**
 * @Title produce
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\29 0029 17:11
 */
public class produce implements Runnable{

    private  resource resource;

    public produce(resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                resource.put();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
