package lyx.study.daili.jdkdaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title myinvocationhandler
 * @Description
 * @Copyright: ��Ȩ���� (c) 2018 - 2019
 * @Company: ������������
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:33
 */
public class myinvocationhandler implements InvocationHandler {

    private Object beidailiduixing;

    //     ʵ��InvocationHandler   �����invoke����
    public Object getproxy(Object beidailiduixing) {
        this.beidailiduixing = beidailiduixing;
        return Proxy.newProxyInstance
                (beidailiduixing.getClass().getClassLoader(),
                        beidailiduixing.getClass().getInterfaces(), this);
//      ���ɴ������    thisָ��ǰhandler
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        qierufangfa fangfa=new qierufangfa();
        qierufangfa.start();
        Object returntype= method.invoke(beidailiduixing, args);
        qierufangfa.end();
        return returntype;
    }
}
