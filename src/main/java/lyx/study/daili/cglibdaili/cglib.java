package lyx.study.daili.cglibdaili;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title cglib
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:23
 */
public class cglib implements MethodInterceptor {
    private Object beidailiduixing;

    public Object getproxy(Object beidailiduixing){
        this.beidailiduixing=beidailiduixing;
        Enhancer enhancer=new Enhancer(); //创建加强器，用来创建动态代理类
        enhancer.setSuperclass(this.beidailiduixing.getClass());//为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setCallback(this); //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
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
