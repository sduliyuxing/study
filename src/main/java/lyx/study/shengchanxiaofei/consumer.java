package lyx.study.shengchanxiaofei;

/**
 * @Title consumer
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\23 0023 9:04
 */
public class consumer extends Thread {

    private resource resource;

    public consumer(resource resource,String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(1000);
               resource.remove();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
