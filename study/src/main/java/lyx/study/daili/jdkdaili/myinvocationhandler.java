package lyx.study.daili.jdkdaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title myinvocationhandler
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:33
 */
public class myinvocationhandler implements InvocationHandler {

    private Object beidailiduixing;

    //     实现InvocationHandler   会调用invoke方法
    public Object getproxy(Object beidailiduixing) {
        this.beidailiduixing = beidailiduixing;
        return Proxy.newProxyInstance
                (beidailiduixing.getClass().getClassLoader(),
                        beidailiduixing.getClass().getInterfaces(), this);
//      生成代理对象    this指当前handler
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
