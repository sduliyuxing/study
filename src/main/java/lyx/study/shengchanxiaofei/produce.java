package lyx.study.shengchanxiaofei;

/**
 * @Title produce
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\23 0023 9:07
 */
public class produce extends Thread {

    private resource resource;

    public produce(resource resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}
