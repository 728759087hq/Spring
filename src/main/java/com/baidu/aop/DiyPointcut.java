package com.baidu.aop;

//自己定义的类
public class DiyPointcut {
    public void before(){
        System.out.println("-----------方法执行前---------------");
    }

    public void after(){
        System.out.println("-----------方法执行后---------------");
    }
}
