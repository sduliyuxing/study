package lyx.study.daili.jiingtaidaili;

/**
 * @Title math
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2019\1\24 0024 16:31
 */
public class math implements book {//具体的被代理类
    @Override
    public void name() {
        System.out.println("数学书");
    }
}
