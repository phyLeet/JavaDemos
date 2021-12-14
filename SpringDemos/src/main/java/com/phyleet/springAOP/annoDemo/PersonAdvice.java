package com.phyleet.springAOP.annoDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Aspect
public class PersonAdvice {
    //定义切点
    @Pointcut(value = "@annotation(com.phyleet.springAOP.annoDemo.UseProxy)")
    private void anyMethod() {
    }  //定义一个切入点

    @AfterReturning("anyMethod()")
    public void doAfter() {
        System.out.println("最终通知");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrowing() {
        System.out.println("异常通知");
    }

    @After("anyMethod()")
    public void after(JoinPoint point) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method targetMethod = methodSignature.getMethod();
        Class targetClass = point.getSignature().getDeclaringType();
        Annotation[] annotations = targetMethod.getAnnotations();
        Object params = point.getArgs();

        /**
         * https://my.oschina.net/u/2316420/blog/662412
         */
    }
}
