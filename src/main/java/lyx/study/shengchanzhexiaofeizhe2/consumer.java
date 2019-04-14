package lyx.study.shengchanzhexiaofeizhe2;

/**
 * @Title consumer
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\29 0029 17:24
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
                 resource.get();
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
}
