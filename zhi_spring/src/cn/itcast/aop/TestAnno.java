package cn.itcast.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	
	@Test
	public void testService() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean33.xml");
		Pig pig = (Pig) context.getBean("pig");
	    //Strongpig spig=(Strongpig) context.getBean("spig");
	       pig.add();
	}
}
