package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import javax.inject.Named;

@Named
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.kaishengit.dao..*.*(..))")
    public void pointcut(){}

   // @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("前置通知...");
    }

    //@AfterReturning(pointcut = "pointcut()",returning = "result")
    public  void thenAdvice(Object result){
        System.out.println("后置通知..." + result);
    }

    //@AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void exceptionAdvice(Exception e){

        System.out.println("异常通知..." + e);
    }

    //@After("pointcut()")
    public void finnalAdvice(){
        System.out.println("最终通知...");
    }


    @Around("pointcut()")
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
