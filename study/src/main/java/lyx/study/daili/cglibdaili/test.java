package lyx.study.daili.cglibdaili;

import org.junit.Test;

/**
 * @Title test
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:28
 */
public class test {

    @Test
    public void cglibtest(){
        book book=new book();
        cglib cglib=new cglib();
        Object obj=cglib.getproxy(book);
        book bookproxy= (book) obj;
        bookproxy.name();
    }
}
