package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Strongpig {
	 @Before(value="execution(* cn.itcast.aop.Pig.*(..))")
     public void before1(){
    	 System.out.println("��ǿǰ......");
     }
    	
    /* public void after(){
    	 System.out.println("��ǿ��.....");
     }
     public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
    	 System.out.println("������ǿǰ.....");
 		
 		//执行被增强的方法
 		proceedingJoinPoint.proceed();
 		
 		//方法之后
 		System.out.println("������ǿ��.....");
     }*/
}
