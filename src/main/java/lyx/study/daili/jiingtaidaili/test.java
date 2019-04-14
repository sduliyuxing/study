package lyx.study.daili.jiingtaidaili;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:46
 */
public class test {

    @Test
    public void jingtaitest(){
        math math=new math();   //被代理对象
        proxy proxy=new proxy(math);   //代理对象
        proxy.name();
    }
}
