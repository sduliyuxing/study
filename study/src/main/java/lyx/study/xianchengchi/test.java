package lyx.study.xianchengchi;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\22 0022 17:06
 */
public class test {

    @Test
    public void test1(){
        pool.newsingle();
    }
    @Test
    public void test2(){
        pool.fixed();
    }
    @Test
    public void test3(){
        pool.cache();
    }

}
