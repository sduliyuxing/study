package lyx.study.daili.jdkdaili;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:37
 */
public class test {

    @Test
    public void jdktest(){           //��̬�������
        math math=new math();    //���������
        myinvocationhandler myproxy=new myinvocationhandler();
        Object obj= myproxy.getproxy(math); //���ɴ������
        book book= (book) obj;  //ת��
        book.name();
    }
}
