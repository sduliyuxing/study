package lyx.study.daili.cglibdaili;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title cglib
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:23
 */
public class cglib implements MethodInterceptor {
    private Object beidailiduixing;

    public Object getproxy(Object beidailiduixing){
        this.beidailiduixing=beidailiduixing;
        Enhancer enhancer=new Enhancer(); //������ǿ��������������̬������
        enhancer.setSuperclass(this.beidailiduixing.getClass());//Ϊ��ǿ��ָ��Ҫ�����ҵ���ࣨ����Ϊ�������ɵĴ�����ָ�����ࣩ
        enhancer.setCallback(this); //���ûص������ڴ����������з����ĵ��ã��������CallBack����Callback����Ҫʵ��intercept()����������
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        qierufangfa fangfa=new qierufangfa();
        qierufangfa.start();
        Object resulttype=methodProxy.invokeSuper(o,objects);
        qierufangfa.end();
        return resulttype;
    }
}
