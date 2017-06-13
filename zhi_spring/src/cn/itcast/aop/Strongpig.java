package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Strongpig {
	 @Before(value="execution(* cn.itcast.aop.Pig.*(..))")
     public void before1(){
    	 System.out.println("增强前......");
     }
    	
    /* public void after(){
    	 System.out.println("增强后.....");
     }
     public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
    	 System.out.println("环绕增强前.....");
 		
 		//鎵ц琚寮虹殑鏂规硶
 		proceedingJoinPoint.proceed();
 		
 		//鏂规硶涔嬪悗
 		System.out.println("环绕增强后.....");
     }*/
}
