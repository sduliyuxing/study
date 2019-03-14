package lyx.study.shengchanzhexiaofeizhe1;

/**
 * @Title produce
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\28 0028 15:53
 */
public class produce implements Runnable {

    private resource resource;

    public produce(resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                resource.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
