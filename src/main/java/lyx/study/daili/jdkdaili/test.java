package lyx.study.daili.jdkdaili;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:37
 */
public class test {

    @Test
    public void jdktest(){           //静态代理测试
        math math=new math();    //被代理对象
        myinvocationhandler myproxy=new myinvocationhandler();
        Object obj= myproxy.getproxy(math); //生成代理对象
        book book= (book) obj;  //转换
        book.name();
    }
}
