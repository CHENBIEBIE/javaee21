package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2016/6/30.
 */
public class MyAdvice {

    public void beforeAdvice(){
        System.out.println("前置通知...");
    }

    public  void thenAdvice(Object result){
        System.out.println("后置通知..." + result);
    }

    public void exceptionAdvice(Exception e){

        System.out.println("异常通知..." + e);
    }

    public void finnalAdvice(){
        System.out.println("最终通知...");
    }


    public Object aroundAdvice(ProceedingJoinPoint joinPoint){

        Object object = null;
        try {
            System.out.println("前置通知~~~~~");

            object = joinPoint.proceed();

            System.out.println("后置通知~~~~~" + object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知~~~~~");
        }finally {
            System.out.println("最终通知~~~~~");
        }
        return object;
    }
}
