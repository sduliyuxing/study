package lyx.study.daili.jiingtaidaili;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:46
 */
public class test {

    @Test
    public void jingtaitest(){
        math math=new math();   //���������
        proxy proxy=new proxy(math);   //�������
        proxy.name();
    }
}
