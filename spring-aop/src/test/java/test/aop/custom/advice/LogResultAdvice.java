package test.aop.custom.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


public class LogResultAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValues, Method method, Object[] args, Object target) {
        System.out.println(method.getName() + "方法返回: " + returnValues);
    }
}
