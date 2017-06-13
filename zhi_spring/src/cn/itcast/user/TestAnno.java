package cn.itcast.user;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	
	@Test
	public void testService() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
	}

	/*@Test
	public void testUser() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		Student sd=(Student) context.getBean("student");
		System.out.println(user);
		System.out.println(sd);
		sd.add();
		user.add();
	}*/
}
